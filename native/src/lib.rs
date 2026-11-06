//! Lazy DLL reader. See ../SCHEMA.md for the C ABI and JSON contract.
mod instructions;
mod metadata;
mod types;

use dotnetdll::prelude::*;
use serde_json::{Value, json};
use std::{
    cell::RefCell,
    collections::HashMap,
    ffi::{CString, c_char},
    ops::Range,
    panic::{AssertUnwindSafe, catch_unwind},
};
use types::Encoder;

/// Self-contained input lifetime: resolution is dropped BEFORE its backing bytes.
/// Never expose either field or permit bytes to be replaced while resolution lives.
pub struct DllHandle {
    resolution: Resolution<'static>,
    methods: Vec<MethodIndex>,
    method_ids: HashMap<MethodIndex, usize>,
    type_ids: HashMap<TypeIndex, usize>,
    type_methods: Vec<Range<usize>>,
    _bytes: Box<[u8]>,
}

impl DllHandle {
    pub fn open(bytes: &[u8]) -> Result<Self, String> {
        let bytes = bytes.to_vec().into_boxed_slice();
        // SAFETY: the boxed allocation does not move when the handle moves. The
        // private resolution cannot escape, and field drop order frees it first.
        let input: &'static [u8] = unsafe { std::mem::transmute::<&[u8], &'static [u8]>(&bytes) };
        let resolution = Resolution::parse(
            input,
            ReadOptions::default()
                .with_lazy_method_bodies(true)
                .with_lazy_attributes(true),
        )
        .map_err(|e| e.to_string())?;
        let methods = metadata::method_indices(&resolution);
        let method_ids = methods.iter().enumerate().map(|(id, &i)| (i, id)).collect();
        let type_ids: HashMap<_, _> = resolution
            .enumerate_type_definitions()
            .enumerate()
            .map(|(id, (i, _))| (i, id))
            .collect();
        let mut counts = vec![0; type_ids.len()];
        for i in &methods {
            counts[type_ids[&i.parent_type()]] += 1;
        }
        let mut start = 0;
        let type_methods = counts
            .into_iter()
            .map(|count| {
                let range = start..start + count;
                start += count;
                range
            })
            .collect();
        Ok(Self {
            resolution,
            methods,
            method_ids,
            type_ids,
            type_methods,
            _bytes: bytes,
        })
    }

    fn encoder(&self) -> Encoder<'_, 'static> {
        Encoder {
            res: &self.resolution,
            methods: &self.methods,
            method_ids: &self.method_ids,
            type_ids: &self.type_ids,
            type_methods: &self.type_methods,
        }
    }

    pub fn metadata(&self) -> Result<Value, String> {
        self.encoder().metadata()
    }
    pub fn index(&self) -> Value {
        self.encoder().index()
    }
    pub fn type_metadata(&self, id: usize) -> Result<Value, String> {
        self.encoder().type_metadata(id)
    }
    pub fn body(&self, id: usize) -> Result<Value, String> {
        self.encoder().body(id)
    }
}

thread_local! { static LAST_ERROR: RefCell<Option<String>> = const { RefCell::new(None) }; }

fn remember(error: String) -> Value {
    LAST_ERROR.with(|slot| *slot.borrow_mut() = Some(error.clone()));
    json!({"error":error})
}
fn guarded<T>(f: impl FnOnce() -> Result<T, String>) -> Result<T, String> {
    catch_unwind(AssertUnwindSafe(f)).unwrap_or_else(|p| {
        let text = p
            .downcast_ref::<String>()
            .map(String::as_str)
            .or_else(|| p.downcast_ref::<&str>().copied())
            .unwrap_or("unknown panic");
        Err(format!("native DLL reader panic: {text}"))
    })
}
fn json_pointer(v: Value) -> *mut c_char {
    // JSON serialization escapes all embedded NUL characters.
    match CString::new(v.to_string()) {
        Ok(s) => s.into_raw(),
        Err(_) => std::ptr::null_mut(),
    }
}
fn json_call(f: impl FnOnce() -> Result<Value, String>) -> *mut c_char {
    match guarded(|| Ok(json_pointer(f()?))) {
        Ok(p) => p,
        Err(e) => json_pointer(remember(e)),
    }
}

/// Copy `len` readable bytes. Returns null on error (see dll_last_error).
/// The caller retains ownership of the input and may release it after this call.
/// # Safety
/// A non-null bytes pointer must address `len` initialized readable bytes.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn dll_open(bytes: *const u8, len: usize) -> *mut DllHandle {
    match guarded(|| {
        if bytes.is_null() || len == 0 || len > isize::MAX as usize {
            return Err("DLL input must be a non-null, nonempty byte slice".into());
        }
        let bytes = unsafe { std::slice::from_raw_parts(bytes, len) };
        let h = DllHandle::open(bytes)?;
        LAST_ERROR.with(|slot| *slot.borrow_mut() = None);
        Ok(Box::into_raw(Box::new(h)))
    }) {
        Ok(h) => h,
        Err(e) => {
            remember(e);
            std::ptr::null_mut()
        }
    }
}

/// Returns an owned JSON error string, or {"error":null}; free with dll_free.
#[unsafe(no_mangle)]
pub extern "C" fn dll_last_error() -> *mut c_char {
    json_call(|| Ok(LAST_ERROR.with(|slot| json!({"error":*slot.borrow()}))))
}

/// # Safety
/// Handle must be null or a live handle returned by dll_open. Do not race close.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn dll_metadata(handle: *const DllHandle) -> *mut c_char {
    json_call(|| {
        let h = unsafe { handle.as_ref() }.ok_or("null DLL handle")?;
        h.metadata()
    })
}

/// # Safety
/// Handle must be null or a live handle returned by dll_open. Do not race close.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn dll_index(handle: *const DllHandle) -> *mut c_char {
    json_call(|| {
        let h = unsafe { handle.as_ref() }.ok_or("null DLL handle")?;
        Ok(h.index())
    })
}

/// # Safety
/// Handle must be null or a live handle returned by dll_open. Do not race close.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn dll_type(handle: *const DllHandle, type_id: u64) -> *mut c_char {
    json_call(|| {
        let h = unsafe { handle.as_ref() }.ok_or("null DLL handle")?;
        h.type_metadata(usize::try_from(type_id).map_err(|_| "type id exceeds platform size")?)
    })
}

/// # Safety
/// Handle must be null or a live handle returned by dll_open. Do not race close.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn dll_body(handle: *const DllHandle, method_id: u64) -> *mut c_char {
    json_call(|| {
        let h = unsafe { handle.as_ref() }.ok_or("null DLL handle")?;
        h.body(usize::try_from(method_id).map_err(|_| "method id exceeds platform size")?)
    })
}

/// # Safety
/// Pointer must be null or an unfreed string returned by this library.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn dll_free(string: *mut c_char) {
    if let Err(e) = guarded(|| {
        if !string.is_null() {
            unsafe { drop(CString::from_raw(string)) };
        }
        Ok(())
    }) {
        remember(e);
    }
}

/// # Safety
/// Handle must be null or an unclosed handle returned by dll_open. No concurrent use.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn dll_close(handle: *mut DllHandle) {
    if let Err(e) = guarded(|| {
        if !handle.is_null() {
            unsafe { drop(Box::from_raw(handle)) };
        }
        Ok(())
    }) {
        remember(e);
    }
}

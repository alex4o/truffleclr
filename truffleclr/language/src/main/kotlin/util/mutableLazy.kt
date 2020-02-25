package util

import runtime.Type
import runtime.TypeInfo
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <T> mutableLazy(function: () -> T): ReadWriteProperty<Any?, T> {
  return MutableLazyProperty(lazy(function))
}

class MutableLazyProperty<T>(private val lazy: Lazy<T>): ReadWriteProperty<Any?, T> {
  private var value: T? = null

  override operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
    return value ?: lazy.getValue(thisRef, property)
  }

  override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    this.value = value
  }
}
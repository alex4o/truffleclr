import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class TestApp {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");

        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);

        long base = unsafe.arrayBaseOffset(int.class);
//        unsafe.freeMemory();
    }
}

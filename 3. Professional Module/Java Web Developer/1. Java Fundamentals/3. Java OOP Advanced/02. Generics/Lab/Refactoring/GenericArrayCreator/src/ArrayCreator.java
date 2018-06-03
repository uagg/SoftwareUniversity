import java.lang.reflect.Array;

public class ArrayCreator<T> {

    static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }

    static <T> T[] create(Class<T> arr, int length, T item) {
        T[] array = (T[]) Array.newInstance(arr, length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }
}

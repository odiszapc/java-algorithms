package utils;

public class ArrayUtils {

    public static void forwardSwap(int array[], int firsIndex, int secondIndex) {
        if (array[firsIndex] > array[secondIndex])
            swap(array, firsIndex, secondIndex);
    }

    public static void backSwap(int array[], int firsIndex, int secondIndex) {
        if (array[firsIndex] < array[secondIndex])
            swap(array, firsIndex, secondIndex);
    }

    public static void swap(int array[], int firsIndex, int secondIndex) {
        int tmp = array[firsIndex];
        array[firsIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}

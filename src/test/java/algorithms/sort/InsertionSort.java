package algorithms.sort;


import utils.ArrayUtils;

public class InsertionSort extends SortTestBase {

    @Override
    protected void sortAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int prevIndex = i - 1;
            while (prevIndex >= 0 && array[prevIndex] > array[prevIndex + 1]) {
                ArrayUtils.swap(array, prevIndex + 1, prevIndex);
                prevIndex--;
            }
        }
    }

    @Override
    protected void sortDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int prevIndex = i - 1;
            while (prevIndex >= 0 && array[prevIndex] < array[prevIndex + 1]) {
                ArrayUtils.swap(array, prevIndex + 1, prevIndex);
                prevIndex--;
            }
        }
    }
}

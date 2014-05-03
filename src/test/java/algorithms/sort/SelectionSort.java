package algorithms.sort;

import utils.ArrayUtils;

public class SelectionSort extends SortTestBase {

    @Override
    protected void sortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;

            if (min != i)
                ArrayUtils.swap(array, min, i);
        }
    }

    @Override
    protected void sortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] > array[max])
                    max = j;

            if (max != i)
                ArrayUtils.swap(array, max, i);
        }
    }
}

package algorithms.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearch {

    @Test
    public void binarySearchEven() throws Exception {
        int[] array = {2, 14, 19, 43, 50, 84, 94};
        int index = findFirstIndex(array, 14);
        Assert.assertEquals(index, 1);
    }

    @Test
    public void binarySearchOdd() throws Exception {
        int[] array = {2, 14, 19, 43, 50, 84, 94, 100};
        int index = findFirstIndex(array, 14);
        Assert.assertEquals(index, 1);
    }

    @Test
    public void binarySearchEvenNotFound() throws Exception {
        int[] array = {2, 14, 19, 43, 50, 84, 94};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(index, -1);
    }

    @Test
    public void binarySearchEmptyArray() throws Exception {
        int[] array = {};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(index, -1);
    }

    @Test
    public void binarySearchSingleElement() throws Exception {
        int[] array = {13};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(index, 0);
    }

    @Test
    public void binarySearchOddNotFound() throws Exception {
        int[] array = {2, 14, 19, 43, 50, 84, 94, 100};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(index, -1);
    }

    private int findFirstIndex(int[] array, int value) {
        int index = -1;
        if (0 == array.length)
            return index;

        return findFirstIndex(array, value, 0, array.length - 1);
    }

    private int findFirstIndex(int[] array, int value, int from, int to) {
        if (array[from] == value)
            return from;

        if (from == to)
            return -1;

        int middle = (to - from) / 2;
        if (value >= array[middle])
            return findFirstIndex(array, value, from + middle, from + middle + (to - from - middle) - (to - from) % 2);
        else
            return findFirstIndex(array, value, from, middle - (1 - (to - from) % 2));
    }
}

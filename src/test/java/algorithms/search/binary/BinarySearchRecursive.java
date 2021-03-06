package algorithms.search.binary;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchRecursive {

    @Test
    public void binarySearchEven() throws Exception {
        int[] array = {2, 14, 19, 43, 50, 84, 94};
        int index = findFirstIndex(array, 14);
        Assert.assertEquals(1, index);
    }

    @Test
    public void binarySearchOdd() throws Exception {
        int[] array = {2, 14, 19, 43, 50, 84, 94, 100};
        int index = findFirstIndex(array, 14);
        Assert.assertEquals(1, index);
    }

    @Test
    public void binarySearchEvenNotFound() throws Exception {
        int[] array = {2, 14, 19, 43, 50, 84, 94};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void binarySearchEmptyArray() throws Exception {
        int[] array = {};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void binarySearchSingleElement() throws Exception {
        int[] array = {13};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(0, index);
    }

    @Test
    public void binarySearchSingleElementNotFound() throws Exception {
        int[] array = {10};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void binarySearchOddNotFound() throws Exception {
        int[] array = {2, 14, 19, 43, 50, 84, 94, 100};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void binarySearchDuplicates() throws Exception {
        int[] array = {13, 13, 13, 13, 13, 13, 13, 13};
        int index = findFirstIndex(array, 13);
        Assert.assertEquals(3, index);
    }

    @Test
    public void largeDataset() throws Exception {
        int[] array = new int[100000];

        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }

        int index = findFirstIndex(array, 1000);
        Assert.assertEquals(1000, index);
    }

    @Test
    public void largeDatasetNotFound() throws Exception {
        int[] array = new int[100000];

        for (int i = 0; i < 100000; i++) {
            if (1000 == i) {
                array[i] = i - 1;
                continue;
            }
            array[i] = i;
        }

        int index = findFirstIndex(array, 1000);
        Assert.assertEquals(-1, index);
    }

    protected int findFirstIndex(int[] array, int value) {
        if (0 == array.length)
            return -1;

        return findFirstIndex(array, value, 0, array.length - 1);
    }

    private int findFirstIndex(int[] array, int value, int from, int to) {
        if (from > to)
            return -1;

        int middle = from + (to - from) / 2;
        if (array[middle] == value)
            return middle;

        if (value > array[middle])
            return findFirstIndex(array, value, middle + 1, to);
        else
            return findFirstIndex(array, value, from, middle - 1);
    }
}

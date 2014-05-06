package algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;
import utils.ArrayUtils;

public class ArrayBasics {

    @Test
    public void findMaximum() throws Exception {
        int[] array = {94, 19, 50, 14, 2, 43, 84};

        int max = array[0];
        for (int anArray : array)
            if (anArray > max)
                max = anArray;

        Assert.assertEquals(94, max);
    }

    @Test
    public void computeAverage() throws Exception {
        double sum = 0.0;
        int[] array = {94, 19, 50, 14, 2, 43, 84};
        for (int val : array) {
            sum += val;
        }

        double avg = sum / array.length;
        Assert.assertEquals(43.7142, avg, 0.001);
    }

    @Test
    public void copyArray() throws Exception {
        int[] src = {94, 19, 50, 14, 2, 43, 84};
        int[] dst = new int[src.length];
        for (int i = 0; i < dst.length; i++)
            dst[i] = src[i];

        Assert.assertArrayEquals(new int[]{94, 19, 50, 14, 2, 43, 84}, dst);
    }

    @Test
    public void reverseArray() throws Exception {
        int[] array = {94, 19, 50, 14, 2, 43, 84};
        for (int i = 0; i < array.length / 2; i++)
            ArrayUtils.swap(array, i, array.length - 1 - i);

        Assert.assertArrayEquals(new int[]{84, 43, 2, 14, 50, 19, 94}, array);
    }
}

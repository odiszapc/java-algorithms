package algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayBasics {

    @Test
    public void findMaximum() throws Exception {
        int[] array = {94, 19, 50, 14, 2, 43, 84};

        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

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
}

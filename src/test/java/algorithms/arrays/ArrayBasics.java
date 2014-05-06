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
}

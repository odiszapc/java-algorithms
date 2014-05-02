package algorithms.sort;

import org.junit.Assert;
import org.junit.Test;
import utils.ArrayUtils;

import java.util.Arrays;

public class BubbleSort {

    @Test
    public void simpleBubbleForward() throws Exception {
        int[] array = {94, 19, 50, 14, 2, 43, 84};

        System.out.println("Source array: " + Arrays.toString(array));
        for (int barrier = array.length; barrier > 0; barrier--) {
            for (int index = 0; index < barrier - 1; index++) {
                ArrayUtils.forwardSwap(array, index, index + 1);
            }
        }
        Assert.assertArrayEquals(new int[]{2, 14, 19, 43, 50, 84, 94}, array);
    }

    @Test
    public void simpleBubbleBackward() throws Exception {
        int[] array = {94, 19, 50, 14, 2, 43, 84};

        System.out.println("Source array: " + Arrays.toString(array));
        for (int barrier = array.length; barrier > 0; barrier--) {
            for (int index = 0; index < barrier - 1; index++) {
                ArrayUtils.backSwap(array, index, index + 1);
            }
        }
        Assert.assertArrayEquals(new int[]{94, 84, 50, 43, 19, 14, 2}, array);
    }

}

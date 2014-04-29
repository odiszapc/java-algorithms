package algorithms.sort.bubble;

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
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

}

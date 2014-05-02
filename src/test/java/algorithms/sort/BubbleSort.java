package algorithms.sort;

import utils.ArrayUtils;

public class BubbleSort extends SortTestBase {

    @Override
    protected void sortAsc(int[] array) {
        for (int barrier = array.length; barrier > 0; barrier--) {
            for (int index = 0; index < barrier - 1; index++) {
                ArrayUtils.forwardSwap(array, index, index + 1);
            }
        }
    }

    @Override
    protected void sortDesc(int[] array) {
        for (int barrier = array.length; barrier > 0; barrier--) {
            for (int index = 0; index < barrier - 1; index++) {
                ArrayUtils.backSwap(array, index, index + 1);
            }
        }
    }
}

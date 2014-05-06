package algorithms.search.binary;

import org.junit.Ignore;
import org.junit.Test;

public class BinarySearch extends BinarySearchRecursive {

    @Override
    protected int findFirstIndex(int[] array, int value) {
        int from = 0;
        int to = array.length - 1;

        while (from <= to) {
            int middle = (to + from) >>> 1;
            if (array[middle] == value)
                return middle;

            if (value > array[middle])
                from = middle + 1;
            else
                to = middle - 1;
        }
        return -1;
    }
}

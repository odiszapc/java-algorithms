package algorithms.search.binary;

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

    @Test
    public void performance() throws Exception {
        int[] array = new int[100000];

        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }

        long started = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            findFirstIndex(array, 1000); // 9 ms faster than Arrays.binarySearch
        }
        System.out.println(String.format("Execution time = %s ms", System.currentTimeMillis() - started));
    }
}

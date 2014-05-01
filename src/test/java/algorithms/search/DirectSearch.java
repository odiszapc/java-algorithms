package algorithms.search;

import org.junit.Assert;
import org.junit.Test;

public class DirectSearch {

    @Test
    public void directSearch() throws Exception {
        int[] array = {94, 19, 50, 14, 2, 43, 84};
        int element = 2;
        int index = findFirstIndex(array, element);
        Assert.assertEquals(4, index);
    }

    private int findFirstIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value)
                return i;
        return -1;
    }
}

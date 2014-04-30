package algorithms.search;

import org.junit.Test;

import java.util.Arrays;

public class DirectSearch {

    @Test
    public void directSearch() throws Exception {
        int[] array = {94, 19, 50, 14, 2, 43, 84};
        int element = 2;
        int index = findFirstIndex(array, element);

        if (index >= 0)
            System.out.println(String.format("Element %s has index %s in %s", element, index, Arrays.toString(array)));
        else
            System.out.println("Element not found.");
    }

    private int findFirstIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value)
                return i;
        return -1;
    }
}

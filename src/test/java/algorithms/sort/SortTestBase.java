package algorithms.sort;

import org.junit.Assert;
import org.junit.Test;

public abstract class SortTestBase {

    private static final int[] ARRAY = {94, 19, 50, 14, 2, 43, 84};
    private static final int[] ARRAY_ASC = {2, 14, 19, 43, 50, 84, 94};
    private static final int[] ARRAY_DESC = {94, 84, 50, 43, 19, 14, 2};

    protected abstract void sortAsc(int[] array);

    protected abstract void sortDesc(int[] array);

    @Test
    public void sortAscTest() throws Exception {
        sortAsc(ARRAY);
        Assert.assertArrayEquals(ARRAY_ASC, ARRAY);
    }

    @Test
    public void sortDescTest() throws Exception {
        sortDesc(ARRAY);
        Assert.assertArrayEquals(ARRAY_DESC, ARRAY);
    }
}

package algorithms.sort;

import org.junit.Assert;
import org.junit.Test;

public abstract class SortTestBase {

    private static final int[] ARRAY = {94, 19, 50, 14, 2, 43, 84};
    private static final int[] ARRAY_ASC = {2, 14, 19, 43, 50, 84, 94};
    private static final int[] ARRAY_DESC = {94, 84, 50, 43, 19, 14, 2};

    private static final int[] ARRAY_EMPTY = {};
    private static final int[] ARRAY_EMPTY_ASC = {};
    private static final int[] ARRAY_EMPTY_DESC = {};

    private static final int[] ARRAY_SINGLE = {14};
    private static final int[] ARRAY_SINGLE_ASC = {14};
    private static final int[] ARRAY_SINGLE_DESC = {14};

    private static final int[] ARRAY_MINIMAL = {14, 2};
    private static final int[] ARRAY_MINIMAL_ASC = {2, 14};
    private static final int[] ARRAY_MINIMAL_DESC = {14, 2};

    protected abstract void sortAsc(int[] array);

    protected abstract void sortDesc(int[] array);

    @Test
    public void sortAscTest() throws Exception {
        sortAsc(ARRAY);
        Assert.assertArrayEquals(ARRAY_ASC, ARRAY);
    }

    @Test
    public void sortEmptyAscTest() throws Exception {
        sortAsc(ARRAY_EMPTY);
        Assert.assertArrayEquals(ARRAY_EMPTY_ASC, ARRAY_EMPTY);
    }

    @Test
    public void sortSingleAscTest() throws Exception {
        sortAsc(ARRAY_SINGLE);
        Assert.assertArrayEquals(ARRAY_SINGLE_ASC, ARRAY_SINGLE);
    }

    @Test
    public void sortMinimalAscTest() throws Exception {
        sortAsc(ARRAY_MINIMAL);
        Assert.assertArrayEquals(ARRAY_MINIMAL_ASC, ARRAY_MINIMAL);
    }

    @Test
    public void sortDescTest() throws Exception {
        sortDesc(ARRAY);
        Assert.assertArrayEquals(ARRAY_DESC, ARRAY);
    }

    @Test
    public void sortEmptyDescTest() throws Exception {
        sortDesc(ARRAY_EMPTY);
        Assert.assertArrayEquals(ARRAY_EMPTY_DESC, ARRAY_EMPTY);
    }

    @Test
    public void sortSingleDecTest() throws Exception {
        sortDesc(ARRAY_SINGLE);
        Assert.assertArrayEquals(ARRAY_SINGLE_DESC, ARRAY_SINGLE);
    }

    @Test
    public void sortMinimalDescTest() throws Exception {
        sortDesc(ARRAY_MINIMAL);
        Assert.assertArrayEquals(ARRAY_MINIMAL_DESC, ARRAY_MINIMAL);
    }
}

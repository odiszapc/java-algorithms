package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;

/**
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 */
public class PascalTriangle {

    @Test
    public void pascalTriangle() throws Exception {
        Assert.assertEquals(1, pascal(0, 0));

        Assert.assertEquals(1, pascal(0, 1));
        Assert.assertEquals(1, pascal(1, 1));

        Assert.assertEquals(1, pascal(0, 2));
        Assert.assertEquals(2, pascal(1, 2));
        Assert.assertEquals(1, pascal(2, 2));

        Assert.assertEquals(1, pascal(0, 3));
        Assert.assertEquals(3, pascal(1, 3));
        Assert.assertEquals(3, pascal(2, 3));
        Assert.assertEquals(1, pascal(3, 3));


        Assert.assertEquals(1, pascal(0, 4));
        Assert.assertEquals(4, pascal(1, 4));
        Assert.assertEquals(6, pascal(2, 4));
        Assert.assertEquals(4, pascal(3, 4));
        Assert.assertEquals(1, pascal(4, 4));
    }

    private int pascal(int c, int r) {
        if (c == 0 || c >= r)
            return 1;
        return pascal(c - 1, r - 1) + pascal(c, r - 1);
    }
}

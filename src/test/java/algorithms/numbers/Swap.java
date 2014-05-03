package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;

public class Swap {

    @Test
    public void slowSwap() throws Exception {
        int a = 111;
        int b = 222;

        int tmp = a;
        a = b;
        b = tmp;

        Assert.assertEquals(222, a);
        Assert.assertEquals(111, b);
    }

    @Test
    public void fastSwap() throws Exception {
        int a = 111;
        int b = 222;

        a ^= b;
        b ^= a;
        a ^= b;

        Assert.assertEquals(222, a);
        Assert.assertEquals(111, b);
    }
}

package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;

public class Swap {

    @Test
    public void swap() throws Exception {
        int a = 111;
        int b = 222;

        int tmp = a;
        a = b;
        b = tmp;

        Assert.assertEquals(222, a);
        Assert.assertEquals(111, b);
    }
}

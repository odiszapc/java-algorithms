package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;

public class BitwiseOperators {

    @Test
    public void divideBy2() {
        Assert.assertEquals(1, 1024 >>> 10);
        Assert.assertEquals(2, 1024 >>> 9);
        Assert.assertEquals(4, 1024 >>> 8);
        Assert.assertEquals(8, 1024 >>> 7);
        Assert.assertEquals(16, 1024 >>> 6);
        Assert.assertEquals(32, 1024 >>> 5);
        Assert.assertEquals(64, 1024 >>> 4);
        Assert.assertEquals(128, 1024 >>> 3);
        Assert.assertEquals(256, 1024 >>> 2);
        Assert.assertEquals(512, 1024 >>> 1);
    }

    @Test
    public void multiplyBy2() {
        Assert.assertEquals(2, 1 << 1);
        Assert.assertEquals(4, 1 << 2);
        Assert.assertEquals(8, 1 << 3);
        Assert.assertEquals(16, 1 << 4);
        Assert.assertEquals(32, 1 << 5);
        Assert.assertEquals(64, 1 << 6);
        Assert.assertEquals(128, 1 << 7);
        Assert.assertEquals(256, 1 << 8);
        Assert.assertEquals(512, 1 << 9);
        Assert.assertEquals(1024, 1 << 10);
    }

    @Test
    public void swap() {
        int a = 111;
        int b = 222;
        a ^= b;
        b ^= a;
        a ^= b;
        Assert.assertEquals(222, a);
        Assert.assertEquals(111, b);
    }
}

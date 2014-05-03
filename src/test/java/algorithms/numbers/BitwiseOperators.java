package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;
import utils.BitUtils;

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
    public void turnOnRightBit() throws Exception {
        int x = 6;
        Assert.assertTrue(BitUtils.checkBitIsUnset(x, 0)); // bit is zero
        Assert.assertTrue(BitUtils.checkBitIsSet(x | x + 1, 0)); // bit is set
    }

    @Test
    public void turnOffBitsAfterRightMostNonZero() throws Exception {
        int x = Integer.parseInt("11111000", 2);
        x = x & -x;
        Assert.assertEquals("1000", Integer.toBinaryString(x)); // 00001000
    }

    @Test
    public void turnOffBitsAfterRightMostNonZeroSequence() throws Exception {
        int x = Integer.parseInt("101010001111111100", 2);
        x = ((x | (x - 1)) + 1) & x;
        Assert.assertEquals("101010000000000000", Integer.toBinaryString(x));
    }

    @Test
    public void turnOnBitsAfterRightMostZeroSequence() throws Exception {
        int x = Integer.parseInt("101010111000000000", 2);
        x = x | (x - 1);
        Assert.assertEquals("101010111111111111", Integer.toBinaryString(x));
    }

    @Test
    public void getMaskOfAllNonZerosAfterRightMostNonZero() throws Exception {
        int x = Integer.parseInt("101010111000000000", 2);
        x = x ^ (x - 1);
        Assert.assertEquals("1111111111", Integer.toBinaryString(x));

    }

    @Test
    public void testIntIs2PowNMinus1() throws Exception {
        // x == 2^n-1
        int x = 2 * 2 * 2 * 2 * 2 - 1; // 31
        boolean check = (x & (x + 1)) == 0;
        Assert.assertTrue(check);

    }

    @Test
    public void testBit() throws Exception {
        int value = Integer.parseInt("10011101", 2);
        Assert.assertTrue((value & (1)) != 0); // check 1th bit 10011101
        Assert.assertTrue((value & (1 << 1)) == 0); // check 2th bit   ^
        Assert.assertTrue((value & (1 << 2)) != 0); // check 3th bit
        Assert.assertTrue((value & (1 << 3)) != 0); // check 4th bit
        Assert.assertTrue((value & (1 << 4)) != 0); // check 5th bit
        Assert.assertTrue((value & (1 << 5)) == 0); // check 6th bit
        Assert.assertTrue((value & (1 << 6)) == 0); // check 7th bit
        Assert.assertTrue((value & (1 << 7)) != 0); // check 8th bit
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

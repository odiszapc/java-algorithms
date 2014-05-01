package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;

public class GreatestCommonDivisor {

    @Test
    public void greatestCommonDivisorRecursive() throws Exception {
        Assert.assertEquals(35, gcd(70, 105));
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        int r = a % b;
        return gcd(b, r);
    }
}

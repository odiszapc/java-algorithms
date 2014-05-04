package algorithms.numbers;


import org.junit.Assert;
import org.junit.Test;

public class Factorial {

    @Test
    public void factorialRecursive() throws Exception {
        Assert.assertEquals(24, factorial(4));
    }

    private int factorial(int x) {
        if (0 == x)
            return 1;
        return x * factorial(x - 1);
    }
}

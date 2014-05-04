package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequence {

    @Test
    public void fibonacci() throws Exception {
        Assert.assertEquals(55, fib(10));
    }

    @Test
    public void fibonacciRecursive() throws Exception {
        Assert.assertEquals(55, fibRec(10));
    }

    private int fibRec(int x) {
        return x < 2 ? x : (fibRec(x - 2) + fibRec(x - 1));
    }

    private int fib(int x) {
        int[] row = new int[x+1];
        row[0] = 0;
        row[1] = 1;
        for (int i = 2; i < row.length; i++)
            row[i] = row[i-2] + row[i-1];

        return row[x];
    }
}

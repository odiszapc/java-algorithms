package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequence {

    @Test
    public void fibonacci() throws Exception {
        Assert.assertEquals(55, fibonacci(11));
    }

    private int fibonacci(int x) {
        int[] row = new int[x];
        row[0] = 0;
        row[1] = 1;
        for (int i = 2; i < row.length; i++)
            row[i] = row[i-2] + row[i-1];

        return row[x-1];
    }
}

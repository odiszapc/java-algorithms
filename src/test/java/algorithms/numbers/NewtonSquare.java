package algorithms.numbers;

import org.junit.Assert;
import org.junit.Test;

public class NewtonSquare {

    private static final double PRECISION = 0.00001;

    @Test
    public void testName() throws Exception {
        Assert.assertEquals(1.41421, sqrt(2), 0.00001);
        Assert.assertEquals(1e-3, sqrt(1e-6), 0.0000001);
        Assert.assertEquals(20e15, sqrt(1e40), 1e20);
    }

    public double sqrt(double val) {
        return iterate(val, 1.0);
    }

    private double iterate(double val, double guess) {
        return isGoodEnough(guess, val)
                ? guess
                : iterate(val, improve(val, guess));
    }

    private boolean isGoodEnough(double approx, double val) {
        return Math.abs(approx * approx - val) / val < PRECISION;
    }

    private double improve(double val, double b) {
        return (val / b + b) / 2;
    }
}

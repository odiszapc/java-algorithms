package algorithms.numbers;


import org.junit.Assert;
import org.junit.Test;

public class MoneyChange {

    @Test
    public void simple() {
        Assert.assertEquals(3, countChange(4, new int[]{1, 2}));
    }

    @Test
    public void sortedCHF() {
        Assert.assertEquals(1022, countChange(300, new int[]{5, 10, 20, 50, 100, 200, 500}));
    }

    @Test
    public void noPennies() {
        Assert.assertEquals(0, countChange(301, new int[]{5, 10, 20, 50, 100, 200, 50}));
    }

    @Test
    public void unsortedCHF() {
        Assert.assertEquals(1022, countChange(300, new int[]{500, 5, 50, 100, 20, 200, 10}));
    }

    /**
     * Counts how many different ways you can make change for an amount, given a list of coin denominations.
     * For example, there are 3 ways to give change for 4 if you have coins with denomiation 1 and 2:
     * 1+1+1+1, 1+1+2, 2+2.
     */
    public static int countChange(int money, int[] coins) {
        return countChange(money, coins, 0);
    }

    private static int countChange(int money, int[] coins, int pointer) {
        if (0 == money || pointer >= coins.length)
            return 0;

        if (money - coins[pointer] > 0)
            return countChange(money - coins[pointer], coins, pointer) + countChange(money, coins, pointer + 1);

        if (money - coins[pointer] == 0)
            return 1 + countChange(money, coins, pointer + 1);

        return countChange(money, coins, pointer + 1);
    }
}

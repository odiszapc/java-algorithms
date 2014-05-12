package algorithms.grammar;


import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ParenthesesBalancing {

    private static final char OPEN = '(';
    private static final char CLOSE = ')';
    private static final String OPEN_STR = String.valueOf(OPEN);
    private static final String CLOSE_STR = String.valueOf(CLOSE);

    @Test
    public void balance() {
        Assert.assertTrue(balance("(if (zero? x) max (/ 1 x))"));
        Assert.assertTrue(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)"));
        Assert.assertTrue(balance("()()()"));
        Assert.assertTrue(balance(""));

        Assert.assertFalse(balance(":-)"));
        Assert.assertFalse(balance("())("));
        Assert.assertFalse(balance("("));
        Assert.assertFalse(balance(")"));
    }

    private boolean balance(String text) {
        return balance(text.toCharArray(), 0, new Stack<String>());
    }

    private boolean balance(char[] text, int pointer, Stack<String> stack) {
        if (pointer == text.length)
            return stack.empty();

        if (text[pointer] == OPEN)
            stack.push(OPEN_STR);

        else if (text[pointer] == CLOSE) {
            if (!stack.empty()) {
                if (stack.peek().equals(OPEN_STR))
                    stack.pop();
            } else {
                stack.push(CLOSE_STR);
            }
        }
        return balance(text, pointer + 1, stack);
    }
}

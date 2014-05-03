package utils;

public class BitUtils {

    public static boolean checkBitIsSet(int value, int bit) {
        return ((value & (1 << bit)) != 0);
    }

    public static boolean checkBitIsUnset(int value, int bit) {
        return ((value & (1 << bit)) == 0);
    }
}

package codewars.java.counting.sheep.dot.dot.dot;

import java.util.Arrays;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(n -> {
            if (n != null && n == true) {
                return true;
            }
            return false;
        }).count();
    }
}
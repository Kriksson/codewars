package codewars.java.show.multiples.of._2.numbers.within.a.range;

import java.util.*;

public class Solution {
    public static List<Integer> findMultiples(int a, int b, int limit) {
        List<Integer> x = new ArrayList<>();
        for (int i = 1; i < limit+1; i++) {
            if (i % a == 0 && i % b == 0) x.add(i);

        }
        return x;
    }
}
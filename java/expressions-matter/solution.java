package codewars.java.expressions.matter;

import java.util.stream.Stream;

public class Kata
{
    public static int expressionsMatter(int a, int b, int c) {
        int max = 0;
        if (a * (b + c) > max) max = a * (b + c);
        if (a + b +c > max) max = a + b + c;
        if (a * b * c > max) max = a * b * c;
        if (a + b * c > max) max = a + b * c;
        if ((a+b)*c > max) max = (a+b)*c;
        return max;
    }
}
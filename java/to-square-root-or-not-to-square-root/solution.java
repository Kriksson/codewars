package codewars.java.to.square.root.or.not.to.square.root;

import java.util.Arrays;

public class Kata
{
  public static int[] squareOrSquareRoot(int[] array) {
    return Arrays.stream(array).map(n -> {
      int sqrt = (int) Math.sqrt(n);
      if (sqrt * sqrt == n) { return sqrt; } else { return n*n; }})
            .toArray();
  }
}
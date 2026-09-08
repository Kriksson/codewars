package codewars.java.number.of.trailing.zeros.of.n;

public class Solution {
  public static int zeros(int n) {
      if (n == 0) return 0;
      int sum = 0;
      while (n >= 5) {
          n = n/5;
          sum += n;
      }
      return sum;
  }
}
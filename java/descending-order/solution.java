package codewars.java.descending.order;


import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(int num) {
    if (num == 0) return 0;
    char[] c = Integer.toString(num).toCharArray();
    Arrays.sort(c);
    return Integer.parseInt(new StringBuilder(new String(c)).reverse().toString());
  }
}
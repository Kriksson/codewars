package codewars.java.common.denominators;

public class Fracts {

  public static String convertFrac(long[][] lst) {
    if (lst == null || lst.length == 0) {
      return "";
    }
    for (long[] frac : lst) {
      long gcd = gcd(frac[0], frac[1]);
      frac[0] /= gcd;
      frac[1] /= gcd;
    }
    long commonDenominator = lst[0][1];

    for (int i = 1; i < lst.length; i++) {
      commonDenominator = lcm(commonDenominator, lst[i][1]);
    }

    StringBuilder result = new StringBuilder();

    for (long[] frac : lst) {
      long multiplier = commonDenominator / frac[1];
      long numerator = frac[0] * multiplier;

      result.append("(")
              .append(numerator)
              .append(",")
              .append(commonDenominator)
              .append(")");
    }

    return result.toString();
  }

  private static long gcd(long a, long b) {
    while (b != 0) {
      long temp = b;
      b = a % b;
      a = temp;
    }

    return a;
  }

  private static long lcm(long a, long b) {
    return a / gcd(a, b) * b;
  }
}
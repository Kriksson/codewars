package codewars.java.highest.and.lowest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kata {
  public static String highAndLow(String numbers) {
    List<String> c = new ArrayList<>(List.of(numbers.split(" ")));
    c.sort(Comparator.comparing(Integer::parseInt));
    return String.format("%s %s", c.get(c.size()-1), c.get(0));
  }
}
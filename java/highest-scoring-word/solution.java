package codewars.java.highest.scoring.word;

import java.util.HashMap;
import java.util.Map;

public class Kata {

  public static String high(String s) {
    String[] words = s.trim().split("\\s+");
    int maxPower = -1;
    String bestWord = "";
    for (String word:words) {
      int currentPower = 0;
      for (char c : word.toCharArray()) {
        currentPower += getPower(c);
      }
      System.out.println(word + " " + currentPower);
      if (currentPower > maxPower) {
        maxPower = currentPower;
        bestWord = word;
      }
    }
    return bestWord;
  }
  static int getPower(char s) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    return alphabet.indexOf(s) + 1;
  }
}
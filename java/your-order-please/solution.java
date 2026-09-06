package codewars.java.your.order.please;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
  public static String order(String words) {
    String[] wordsArray = words.trim().split("\\s+");
    String[] newWordsArray = words.trim().split("\\s+");
    for (String word : wordsArray) {
      int numberOfWord = 0;
      Matcher m = Pattern.compile("\\d+").matcher(word);
      if (m.find()) {
        numberOfWord = Integer.parseInt(m.group());
        newWordsArray[numberOfWord-1] = word;
      }
    }
    return String.join(" ", newWordsArray);
  }
}
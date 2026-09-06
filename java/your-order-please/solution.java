package codewars.java.your.order.please;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
  public static String order(String words) {
    if (words.trim().isEmpty()) {
      return "";
    }
    String[] wordsArray = words.trim().split("\\s+");
    String[] newWordsArray = new String[wordsArray.length];
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
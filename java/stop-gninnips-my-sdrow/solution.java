package codewars.java.stop.gninnips.my.sdrow;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SpinWords {

  public String spinWords(String sentence) {
    return Pattern.compile("\\S{5,}")
            .matcher(sentence)
            .replaceAll(match -> invertWord(match.group()));
  }
  public static String invertWord(String s) {
    char[] word = s.toCharArray();
    String newWord = "";
    for (int i = 0; i < word.length; i++) {
      newWord = newWord + word[(word.length-1)-i];
    }
    return newWord;
  }
}
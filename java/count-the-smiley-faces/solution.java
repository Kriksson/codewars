package codewars.java.count.the.smiley.faces;

import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      int countGoodSmile = 0;
      for (String smile:arr) {
          if (smile.matches("[:;][-~]?[)D]")) {
              countGoodSmile++;
          }
      }
      return countGoodSmile;
  }
}
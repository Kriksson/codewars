package codewars.java.find.nearest.square.number;

public class CodeWarsMath {
  public static int nearestSq(final int n){
    long closestRoot = Math.round(Math.sqrt(n));
    return (int) (closestRoot * closestRoot);
  }
}
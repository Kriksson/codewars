package codewars.java.mean.square.error;


public class Solution {
  public static double solution(int[] arr1, int[] arr2) {
    double sum = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum = sum + Math.pow(arr2[i] - arr1[i], 2);
    }
    return sum / arr1.length;
  }
}
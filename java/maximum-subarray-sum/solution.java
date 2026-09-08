package codewars.java.maximum.subarray.sum;

public class Max {
  public static int sequence(int[] arr) {
    int currentSum = 0;
    int maxSum = 0;
    for (int num : arr) {
      currentSum += num;
      if (currentSum < 0) {
        currentSum = 0;
      }
      if (currentSum > maxSum) {
        maxSum = currentSum;
      }
    }
    return maxSum;
  }
}
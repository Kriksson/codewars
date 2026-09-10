package codewars.java.counting.change.combinations;

public class ChangeCounter {
  public static int countChange(final int money, final int[] coins) {
      int[] cart = new int[money+1];
      cart[0] = 1;
      for (int coin : coins) {
          for (int i = coin; i < money + 1; i++) {
              cart[i] += cart[i - coin];
          }
      }
       return cart[money];
  }
}
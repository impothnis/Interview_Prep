package Algo_Expert;

import java.util.Arrays;

public class NonConstructibleChange {
  // O(nlong) || O(1)
  public static void main(String[] args) {
    int[] input = new int[] { 5, 7, 1, 1, 2, 3, 22 };

    System.out.println(nonConstructibleChange(input));

  }

  private static Object nonConstructibleChange(int[] input) {
    int change = 0;
    // This whole logic is dependent on Sorting
    Arrays.sort(input);
    for (int coin : input) {

      if (coin > change + 1) {
        return change + 1;
      } else {
        change += coin;
      }
    }
    return change + 1;
  }

}

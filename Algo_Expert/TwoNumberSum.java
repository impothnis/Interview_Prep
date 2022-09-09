package Algo_Expert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * TwoNumberSum
 * Map Approach - Can be used for both finding the index and value pair
 */
public class TwoNumberSum {
  public static int[] twoNumberSum1(int[] array, int targetSum) {
    // Write your code here.
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
      if (map.containsKey(targetSum - array[i])) {
        result[0] = array[i];
        result[1] = targetSum - array[i];
        return result;
      }
      map.put(array[i], i);
    }
    return new int[0];
  }

  /*
   * Binary Search Approach. Most optimized solution. Can be used for finding pair
   * and not the index
   */

  public static int[] twoNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    int left = 0;
    int right = array.length - 1;
    while (left < right) {
      int currentSum = array[left] + array[right];
      if (currentSum == targetSum) {
        return new int[] { array[left], array[right] };
      }
      if (currentSum < targetSum)
        left++;
      if (currentSum > targetSum)
        right--;

    }
    return new int[0];

  }

  /*
   * Hasset approach
   */
  public static int[] twoNumberSum2(int[] array, int targetSum) {
    Set<Integer> set = new HashSet<>();

    for (int x : array) {
      if (set.contains(targetSum - x)) {
        return new int[] { x, targetSum - x };
      } else {
        set.add(x);
      }
    }

    return new int[0];

  }

  public static void main(String[] args) {
    int arr[] = { 13, 4, 12, 3 };
    int[] res = twoNumberSum(arr, 7);
    int[] res1 = twoNumberSum1(arr, 7);
    int[] res2 = twoNumberSum2(arr, 7);
    System.out.println(Arrays.toString(res));
    System.out.println(Arrays.toString(res1));
    System.out.println(Arrays.toString(res2));
  }
}
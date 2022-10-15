package Algo_Expert;

import java.util.Arrays;

public class SortedSquaredArray {

  // Using Two Pointer Method
  // 0(n) time | 0(n) space
  public static int[] sortedSquaredArray(int[] array) {
    int[] result = new int[array.length];
    int smallerValueIdx = 0;
    int largerValueIdx = array.length - 1;
    for (int i = array.length - 1; i >= 0; i--) {
      int smallerValue = array[smallerValueIdx];
      int largerValue = array[largerValueIdx];
      if (Math.abs(smallerValue) > Math.abs(largerValue)) {
        result[i] = smallerValue * smallerValue;
        smallerValueIdx++;
      } else {
        result[i] = largerValue * largerValue;
        largerValueIdx--;
      }
    }
    return result;
  }

  // Using Sort
  // 0(n*long(n)) time | 0(n) space
  public static int[] sortedSquaredArraySort(int[] array) {
    int[] result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      int resut = array[i] * array[i];
      result[i] = resut;
    }
    Arrays.sort(result);
    return result;
  }

  public static void main(String[] args) {
    var input = new int[] { -7, -5, -4, 3, 6, 8, 9 };
    System.out.println(Arrays.toString(sortedSquaredArray(input)));
    System.out.println(Arrays.toString(sortedSquaredArraySort(input)));
  }

}

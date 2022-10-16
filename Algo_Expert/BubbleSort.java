package Algo_Expert;

import java.util.Arrays;

public class BubbleSort {

  // Best Case - O(n) || O(1)
  // Average Case - O(n^2) || O(1)
  // Worst Case - O(n^2) || O(1)
  public static int[] bubbleSort(int[] array) {
    if (array.length == 0) {
      return new int[] {};
    }
    boolean isSorted = false;
    int counter = 0;
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - 1 - counter; i++)
        if (array[i] > array[i + 1]) {
          swap(i, i + 1, array);
          isSorted = false;
        }
      counter++;
    }
    return array;
  }

  public static void swap(int i, int j, int[] array) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void main(String[] args) {
    int[] input = { 8, 5, 2, 9, 5, 6, 3 };
    System.out.println(Arrays.toString(bubbleSort(input)));

  }

}

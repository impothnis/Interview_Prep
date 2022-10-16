package Algo_Expert;

import java.util.Arrays;

public class SelectionSort {

  // Best Case - O(n) || O(1)
  // Best Case - O(n) || O(1)
  // Average Case - O(n^2) || O(1)
  // Worst Case - O(n^2) || O(1)

  public static int[] selectionSort(int[] array) {
    if (array.length == 0) {
      return new int[] {};
    }

    int startIndex = 0;
    while (startIndex < array.length - 1) {
      int smallIndex = startIndex;
      for (int i = smallIndex + 1; i < array.length; i++) {
        if (array[smallIndex] > array[i])
          smallIndex = i;
      }
      swap(startIndex, smallIndex, array);
      startIndex++;

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
    System.out.println(Arrays.toString(selectionSort(input)));

  }

}

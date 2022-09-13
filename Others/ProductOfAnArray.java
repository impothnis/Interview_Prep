package Others;

import java.util.Arrays;

public class ProductOfAnArray {

  // Using 2 Additional Arrays
  public static int[] product(int[] arr, int n) {

    // Base case
    if (n == 1) {
      return new int[0];
    }

    int[] left_prod = new int[n];
    int[] right_prod = new int[n];
    int[] result_array = new int[n];

    left_prod[0] = 1;
    right_prod[n - 1] = 1;
    for (int i = 1; i < n; i++) {
      left_prod[i] = left_prod[i - 1] * arr[i - 1];
    }

    for (int i = n - 2; i >= 0; i--) {
      right_prod[i] = right_prod[i + 1] * arr[i + 1];
    }

    for (int i = 0; i < n; i++) {
      result_array[i] = left_prod[i] * right_prod[i];
    }

    return result_array;

  }

  // Using No Additional array
  public static int[] product1(int[] arr, int n) {

    // Base case
    if (n == 1) {
      return new int[0];
    }

    int[] result_array = new int[n];
    result_array[0] = 1;
    // Compute Left product directly in result_array
    for (int i = 1; i < n; i++) {
      result_array[i] = result_array[i - 1] * arr[i - 1];
    }

    int R = 1;
    for (int i = n - 1; i >= 0; i--) {
      result_array[i] = result_array[i] * R;
      R = R * arr[i];
    }

    return result_array;

  }

  /* Driver program to test the above function */
  public static void main(String[] args) {

    int arr[] = { 2, 4, 1, 3 };
    int n = arr.length;
    System.out.println("The product array is : ");
    System.out.println(Arrays.toString(product(arr, n)));
    System.out.println(Arrays.toString(product1(arr, n)));

  }

}

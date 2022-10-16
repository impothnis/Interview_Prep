package Algo_Expert;

public class BinarySearch {

  public static void main(String[] args) {
    System.out.println(binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 33));
    System.out.println(binarySearchRec(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 33));
  }

  // O(log(n)) || O(1) - Iterative approch
  private static int binarySearch(int[] input, int key) {

    int left = 0;
    int right = input.length - 1;

    while (left <= right) {
      int mid = left + ((right - left) / 2);
      if (key == input[mid])
        return mid;
      if (key < input[mid])
        right = mid - 1;
      if (key > input[mid])
        left = mid + 1;
    }
    return -1;

  }

  // O(log(n)) || O(logn) - As Recurrsion takes more space on Call Stack
  private static int binarySearchRecursive(int[] input, int key, int left, int right) {
    if (left > right) {
      return -1;
    }

    int mid = left + (right - left / 2);

    if (key == input[mid]) {
      return mid;
    }

    else if (key < input[mid]) {
      return binarySearchRecursive(input, key, left, mid - 1);
    }

    else {
      return binarySearchRecursive(input, key, mid + 1, right);
    }

  }

  private static int binarySearchRec(int[] input, int key) {
    return binarySearchRecursive(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 33, 0, input.length - 1);
  }

}

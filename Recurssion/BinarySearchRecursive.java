package Recurssion;

public class BinarySearchRecursive {

  public static void main(String[] args) {
    int[] input = { 1, 3, 5, 6, 7, 8, 55, 77, 88 };
    System.out.println(bs(input, 5, 0, input.length - 1));
  }

  private static boolean bs(int[] inputArray, int res, int left, int right) {
    if (left > right)
      return false;

    int mid = left + ((right - left) / 2);
    if (inputArray[mid] == res) {
      return true;
    } else if (res < inputArray[mid])
      return bs(inputArray, res, left, right - 1);
    else
      return bs(inputArray, res, left + 1, right);
  }
}

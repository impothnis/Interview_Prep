package Others;

public class BinarySearchIterative {

  private static Boolean bs(int[] inputArray, int result) {
    int left = 0;
    int right = inputArray.length - 1;
    while (left < right) {
      int mid = left + ((right - left) / 2);
      if (inputArray[mid] == result) {
        return true;
      }
      if (result < inputArray[mid])
        right--;
      else
        left++;

    }
    return false;

  }

  public static void main(String[] args) {
    System.out.println(bs(new int[] { 1, 3, 5, 6, 7, 8, 55, 77, 88 }, 5));
  }

}

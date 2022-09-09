package LeetCode75_Level1;

public class PivotIndex {

  public static int pivotIndex(int[] arr) {

    int total_sum = 0;
    for (int x : arr) {
      total_sum += x;
    }

    int left_sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i != 0)
        left_sum += arr[i - 1];
      if (total_sum - left_sum - arr[i] == left_sum) {
        return arr[i];
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    int[] arr = { 5, 6, 3, 5, 6 };
    System.out.println(pivotIndex(arr));
  }

}

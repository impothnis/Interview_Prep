package Algo_Expert;

import java.util.Arrays;

public class ThreeLargestNumbers {

  public static void main(String[] args) {
    System.out
        .println(Arrays.toString(findThreeLargestNumbers(new int[] { 141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7 })));
  }

  private static int[] findThreeLargestNumbers(int[] inputArray) {
    int[] outPutArray = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };

    for (int num : inputArray) {
      updateOutPutArray(outPutArray, num);
    }
    return outPutArray;

  }

  private static void updateOutPutArray(int[] outPutArray, int num) {
    if (num > outPutArray[2]) {
      shiftAndUpdate(outPutArray, num, 2);
    } else if (num > outPutArray[1]) {
      shiftAndUpdate(outPutArray, num, 1);
    } else if (num > outPutArray[0]) {
      shiftAndUpdate(outPutArray, num, 0);
    }
  }

  private static void shiftAndUpdate(int[] outPutArray, int num, int i) {
    for (int j = 0; j <= i; j++) {
      if (j == i)
        outPutArray[j] = num;
      else
        outPutArray[j] = outPutArray[j + 1];
    }
  }

}

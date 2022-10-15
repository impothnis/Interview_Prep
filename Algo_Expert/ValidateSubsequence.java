package Algo_Expert;

import java.util.*;

class ValidateSubsequenceArray {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

    int arrayPointer = 0;
    int sequencePointer = 0;
    while (arrayPointer < array.size()) {
      if (array.get(arrayPointer).equals(sequence.get(sequencePointer))) {
        sequencePointer++;
        if (sequencePointer == sequence.size())
          return true;
      }
      arrayPointer++;
    }

    // Write your code here.
    return false;

  }

  public static void main(String[] args) {

    var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
    var sequence = Arrays.asList(1, 6, -1, 10);

    System.out.println(isValidSubsequence(array, sequence));

  }

}
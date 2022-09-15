package Others;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrList_GatherZeros {

  public static void zerosToStart(ArrayList<Integer> arrList) {
    ArrayList<Integer> newArrayList = new ArrayList<Integer>();
    int newArray_index = 0;

    // Fill newArrayList with Zeros first.
    // Then Fill it with non-zero Values.
    // In the end, insert every element of newArrayList back into origional arrList.
    for (int i = 0; i < arrList.size(); i++) {

      if (arrList.get(i) == 0)
        newArrayList.add(newArray_index++, arrList.get(i));
    }

    for (int i = 0; i < arrList.size(); i++) {

      if (arrList.get(i) != 0)
        newArrayList.add(newArray_index++, arrList.get(i));
    }

    for (int j = 0; j < newArrayList.size(); j++) {
      arrList.set(j, newArrayList.get(j));
    }
  }

  public static void zerosToEnd(ArrayList<Integer> arrList) {
    ArrayList<Integer> newArrayList = new ArrayList<Integer>();
    int newArray_index = 0;

    // Fill newArrayList with Zeros first.
    // Then Fill it with non-zero Values.
    // In the end, insert every element of newArrayList back into origional arrList.
    for (int i = 0; i < arrList.size(); i++) {

      if (arrList.get(i) != 0)
        newArrayList.add(newArray_index++, arrList.get(i));
    }

    for (int i = 0; i < arrList.size(); i++) {

      if (arrList.get(i) == 0)
        newArrayList.add(newArray_index++, arrList.get(i));
    }

    for (int j = 0; j < newArrayList.size(); j++) {
      arrList.set(j, newArrayList.get(j));
    }
  }

  public static void main(String args[]) {
    ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(5, 0, 20, 4, 0, 0, 9));
    System.out.println("Array List before calling zerosToStart");
    for (int i = 0; i < input.size(); i++) {
      System.out.print(input.get(i) + "  ");
    }
    System.out.println();
    ArrList_GatherZeros.zerosToStart(input);
    System.out.println("Array List after calling zerosToStart");
    for (int i = 0; i < input.size(); i++) {
      System.out.print(input.get(i) + "  ");
    }
    System.out.println();
  }

}

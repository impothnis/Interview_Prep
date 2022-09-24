package Others;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrListRemoveDuplicates {

  public static void removeDuplicates(ArrayList<Character> arrList) {

    for (int i = 0; i < arrList.size(); i++) {
      for (int j = i + 1; j < arrList.size(); j++) {
        if (arrList.get(i).equals(arrList.get(j))) { // check if there is any duplicate
          arrList.remove(j); // remove duplicate
          j--; // j is decremented
        }
      }
    }
  }

  public static void main(String args[]) {
    ArrayList<Integer> values = new ArrayList<Integer>();
    values.add(3);
    values.add(2);
    values.add(1, 1);
    values.get(1);
    values.set(1, 2);
    values.add(3);
    values.remove(1);
    System.out.println(values);

    System.out.println("\"\\Hello World\\\"");
    ArrayList<Character> input = new ArrayList<Character>(Arrays.asList('a', 'b', 'b', 'c', 'c', 'c', 'd'));
    System.out.println("Array List before calling zerosToStart");
    for (int i = 0; i < input.size(); i++) {
      System.out.print(input.get(i) + "  ");
    }
    System.out.println();
    ArrListRemoveDuplicates.removeDuplicates(input);
    System.out.println("Array List after calling zerosToStart");
    for (int i = 0; i < input.size(); i++) {
      System.out.print(input.get(i) + "  ");
    }
    System.out.println();
  }

}

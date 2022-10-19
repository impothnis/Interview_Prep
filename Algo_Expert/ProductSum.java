package Algo_Expert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {

  public static void main(String[] args) {
    List<Object> test = new ArrayList<Object>(
        Arrays.asList(
            5,
            2,
            new ArrayList<Object>(Arrays.asList(7, -1)),
            3,
            new ArrayList<Object>(
                Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));

    System.out.println(productSum(test));
  }

  public static int productSum(List<Object> array) {
    return productSumHelper(array, 1);
  }

  public static int productSumHelper(List<Object> array, int multiplier) {
    int sum = 0;
    for (Object element : array) {
      if (element instanceof ArrayList) {
        @SuppressWarnings("unchecked")
        ArrayList<Object> subList = (ArrayList<Object>) element;
        sum += productSumHelper(subList, multiplier + 1);
      } else {
        sum = sum + (int) element;
      }
    }
    return sum * multiplier;

  }

}

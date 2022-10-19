package Algo_Expert;

import java.util.HashMap;

public class Fibonacci {

  // Classic Recurrsion
  public static int fib(int n) {
    // if (n == 2)
    // return 1;
    // else if (n == 1)
    // return 0;
    if (n < 2)
      return n;
    else
      return fib(n - 1) + fib(n - 2);
  }

  // Memoize Recurrsion
  public static int fibMemoize(int n) {
    HashMap<Integer, Integer> memoize = new HashMap<>();
    memoize.put(0, 0);
    memoize.put(1, 1);

    if (memoize.containsKey(n)) {
      return memoize.get(n);
    } else {
      memoize.put(n, fib(n - 1) + fib(n - 2));
      return memoize.get(n);
    }

  }

  // Iterative Approach
  public static int fibIterative(int n) {
    int[] fibArray = { 0, 1 };
    int counter = 2;
    while (counter <= n) {
      int next = fibArray[0] + fibArray[1];
      fibArray[0] = fibArray[1];
      fibArray[1] = next;
      counter++;
    }
    return n > 1 ? fibArray[1] : fibArray[0];

  }

  public static void main(String[] args) {
    System.out.println(fib(6));
    System.out.println(fibMemoize(6));
    System.out.println(fibIterative(6));
  }
}

package Recurssion;

import java.util.HashMap;

public class ComputeFibonacciRecursion {
  public static void main(String[] args) {
    // System.out.println(fib(6));
    System.out.println(fibmemo(50));

  }

  private static int fib(int n) {
    if (n < 2)
      return n;
    return fib(n - 1) + fib(n - 2);
  }

  /*
   * memoization Tech
   */
  private static int fibmemo(int n) {
    HashMap<Integer, Integer> memory = new HashMap<>();
    if (n < 2)
      return n;

    if (memory.containsKey(n))
      return memory.get(n);

    int result = fibmemo(n - 1) + fibmemo(n - 2);
    memory.put(n, result);

    return result;
  }

}

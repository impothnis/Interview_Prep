package Algo_Expert;

public class PalindromeCheck {

  public static void main(String[] args) {
    System.out.println(isPalindromeReverseString("abcdcba"));
    System.out.println(isPalindromeStringbuilder("abcdcba"));
    System.out.println(isPalindromeRecurssion("abcdcba"));
    System.out.println(isPalindromePointer("abcdcba"));
  }

  private static boolean isPalindromeReverseString(String string) {
    // Approach 1 - Reveresed String
    // O(n2) TC || O(n) Space //O(n2) - Because strings are immutable and creation
    // on new string takes O(n)

    String reversedString = "";
    for (int i = string.length() - 1; i >= 0; i--) {
      reversedString += string.charAt(i);
    }

    return reversedString.equals(string);
  }

  private static boolean isPalindromeStringbuilder(String string) {
    // Approach 2 - String Builder
    // O(n) TC || O(n) Space

    StringBuilder reversedString = new StringBuilder();
    for (int i = string.length() - 1; i >= 0; i--) {
      reversedString.append(string.charAt(i));
    }

    return string.equals(reversedString.toString());
  }

  private static boolean isPalindromeRecurssion(String string) {
    // Approach 3 - Recurssion
    // Base case is i >= j
    // Keep Tail recurrsion in mind, if tail recurrsion is guarenteed then space
    // will be O(1)
    // O(n) TC || O(n) Space
    return isPalindromeRecurssion(string, 0);
  }

  private static boolean isPalindromeRecurssion(String string, int i) {
    int j = string.length() - 1 - i;
    return i >= j ? true : string.charAt(i) == string.charAt(j) && isPalindromeRecurssion(string, i + 1);
  }

  private static boolean isPalindromePointer(String string) {
    // Approach 2 - String Builder
    // O(n) TC || O(1) Space
    int leftIndex = 0;
    int rightIndex = string.length() - 1;

    while (leftIndex <= rightIndex) {

      if (string.charAt(leftIndex) != string.charAt(rightIndex)) {
        return false;
      } else
        leftIndex++;
      rightIndex--;

    }

    StringBuilder reversedString = new StringBuilder();
    for (int i = string.length() - 1; i >= 0; i--) {
      reversedString.append(string.charAt(i));
    }

    return string.equals(reversedString.toString());
  }

}

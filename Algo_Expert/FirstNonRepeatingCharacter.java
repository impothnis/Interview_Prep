package Algo_Expert;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

  public static void main(String[] args) {
    String input = "abcdcaf";

    System.out.println(firstNonRepeatingCharacter(input));

  }

  // Hasmap Approach
  private static int firstNonRepeatingCharacter(String input) {
    HashMap<Character, Integer> count = new HashMap<>();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      count.put(c, count.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < input.length(); i++) {
      if (count.get(input.charAt(i)) == 1) {
        return i;
      }
    }

    return -1;
  }

  // BruteForce Approach

  // Hasmap Approach
  private static int firstNonRepeatingCharacterBruteForce(String input) {
    boolean isDuplicate = false;
    for (int i = 0; i < input.length(); i++) {

      for (int j = 0; j < input.length(); j++) {
        if (input.charAt(i) == input.charAt(j) && i != j)
          isDuplicate = true;
      }
      if (!isDuplicate)
        return i;
    }

    return -1;
  }

}

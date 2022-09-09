package LeetCode75_Level1;

import java.util.HashMap;

public class IsomorphicStrings {

  private static Boolean isomorphicString(String s, String t) {

    if (s.length() != t.length())
      return false;

    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Boolean> map2 = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char ch1 = s.charAt(i);
      char ch2 = s.charAt(i);
      if (map1.containsKey(ch1) == true) {
        if (map1.get(ch1) != ch2) {
          return false;
        }
      } else {
        if (map2.containsKey(ch2) == true) {
          return false;
        } else {
          map1.put(ch1, ch2);
          map2.put(ch2, true);
        }

      }
    }
    return true;

  }

  public static void main(String[] args) {
    String s = "foo";
    String t = "bar";
    System.out.println(isomorphicString(s, t));
  }

}

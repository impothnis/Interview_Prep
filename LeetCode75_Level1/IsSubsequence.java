package LeetCode75_Level1;

public class IsSubsequence {

  public static Boolean isSubsequence(String s, String t) {
    int s_pointer = 0;
    int t_pointer = 0;

    while (t_pointer < t.length()) {
      if (t.charAt(t_pointer) == s.charAt(s_pointer)) {
        s_pointer++;
        if (s_pointer == s.length())
          return true;
      }

      t_pointer++;

    }
    return false;

  }

  public static void main(String[] args) {

    String s = "abc";
    String t = "ahbgd";
    System.out.println(isSubsequence(s, t));
  }

}

package Algo_Expert;

public class CaeserCIpherEncryptor {

  public static void main(String[] args) {
    System.out.println(caesarCypherEncryptorUnicode("xyz", 2));
    System.out.println(caesarCypherEncryptor("xyz", 2));
  }

  // O(n) || O(n)
  private static String caesarCypherEncryptorUnicode(String string, int key) {
    // To Handle Big Key Value
    int newKey = key % 26;
    char[] newLetter = new char[string.length()];

    for (int i = 0; i < string.length(); i++) {
      newLetter[i] = getNewLetterUnicode(string.charAt(i), newKey);
    }

    return new String(newLetter);

  }

  private static char getNewLetterUnicode(char charAt, int key) {
    int newLetter = charAt + key;
    // a - 97 z - 122
    return newLetter <= 122 ? (char) newLetter : (char) (96 + newLetter % 122);
  }

  // O(n) || O(n)
  private static String caesarCypherEncryptor(String string, int key) {
    // To Handle Big Key Value
    int newKey = key % 26;
    char[] newLetter = new char[string.length()];
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    for (int i = 0; i < string.length(); i++) {
      newLetter[i] = getNewLetter(string.charAt(i), alphabet, newKey);
    }

    return new String(newLetter);

  }

  private static char getNewLetter(char newLetter, String alphabet, int newKey) {
    int newLetterCode = alphabet.indexOf(newLetter) + newKey;
    // a - 97 z - 122
    return alphabet.charAt(newLetterCode % 26);
  }

}

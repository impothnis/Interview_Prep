package Algo_Expert;

public class RunLengthEncoding {

  public static void main(String[] args) {
    var input = "AAAAAAAAAAAAABBCCCCDD";
    System.out.println(runLengthEncoding(input));
  }

  // O(n) || O(n)
  private static String runLengthEncoding(String input) {
    StringBuilder encodStringCharacter = new StringBuilder();
    int currentRunLength = 1;

    for (int i = 1; i < input.length(); i++) {
      char currChar = input.charAt(i);
      char prevChar = input.charAt(i - 1);
      if ((currChar != prevChar) || (currentRunLength == 9)) {
        encodStringCharacter.append(Integer.toString(currentRunLength));
        encodStringCharacter.append(prevChar);
        currentRunLength = 0;
      }
      currentRunLength += 1;

    }
    encodStringCharacter.append(Integer.toString(currentRunLength));
    encodStringCharacter.append(input.charAt(input.length() - 1));
    return encodStringCharacter.toString();
  }

}

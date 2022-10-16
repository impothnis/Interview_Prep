package Algo_Expert;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GenerateDocument {

  public static void main(String[] args) {
    String characters = "Bste!hetsi ogEAxpelrt x ";
    String document = "AlgoExpert is the Best!";

    System.out.println(generateDocumentHashMap(characters, document));

  }

  // Approach 1 - Brute force tech
  // O(m * n+m) || O(1) - n - no of characters and m is length of the string

  public boolean generateDocumentBruteForce(String characters, String document) {
    for (int i = 0; i < document.length(); i++) {
      char c = document.charAt(i);
      int docFrequency = countCharacterFrequency(c, document);
      int chrFrequency = countCharacterFrequency(c, characters);

      if (docFrequency > chrFrequency) {
        return false;
      }

    }
    return true;
  }

  public int countCharacterFrequency(char c, String target) {
    int freq = 0;
    for (int i = 0; i < target.length(); i++) {
      char charac = target.charAt(i);
      if (c == charac) {
        freq = freq + 1;
      }

    }
    return freq;
  }

  // Approach 2 - Hashset Approach
  // O(c * n+m) || O(1) - n - no of characters and m is length of the string
  // C is unique characaters

  public boolean generateDocumentHashSet(String characters, String document) {
    Set<Character> alreadyCounted = new HashSet<>();
    for (int i = 0; i < document.length(); i++) {
      char c = document.charAt(i);
      if (alreadyCounted.contains(c)) {
        continue;
      }
      int docFrequency = countCharacterFrequency(c, document);
      int chrFrequency = countCharacterFrequency(c, characters);

      if (docFrequency > chrFrequency) {
        return false;
      }
      alreadyCounted.add(c);
    }
    return true;
  }

  public int countCharacterFrequencyHashSet(char c, String target) {
    int freq = 0;
    for (int i = 0; i < target.length(); i++) {
      char charac = target.charAt(i);
      if (c == charac) {
        freq = freq + 1;
      }

    }
    return freq;
  }

  // Approach 3 - most optimal approach
  // O(n+m) || O(c) - C is no of unique characters n - no of characters and m is
  // length of the string
  private static boolean generateDocumentHashMap(String characters, String document) {
    HashMap<Character, Integer> characterCount = new HashMap<>();

    for (int i = 0; i < characters.length(); i++) {
      char c = characters.charAt(i);
      characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);

    }

    for (int i = 0; i < document.length(); i++) {
      char d = characters.charAt(i);
      if (!characterCount.containsKey(d) || characterCount.get(d) == 0)
        return false;
      characterCount.put(d, characterCount.get(d) - 1);

    }
    return true;

  }

}

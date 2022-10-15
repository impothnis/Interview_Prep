package Algo_Expert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//O(n) Time and O(K) where n is number of competitions and K is number of teams
public class TournamentWinner {

  // Results Array has 1 for home team , 0 for Away Team
  static int HOME_TEAM = 1;

  public static String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // To keep track of Team with highest points
    String currentBestTeam = "";
    // To Keep Scores for each team
    HashMap<String, Integer> scores = new HashMap<>();
    // Add Current best team to Map for comparison
    scores.put(currentBestTeam, 0);

    for (int i = 0; i < competitions.size(); i++) {
      ArrayList<String> teams = competitions.get(i);
      String homeTeam = teams.get(0);
      String AwayTeam = teams.get(1);

      String winingTeam = results.get(i) == HOME_TEAM ? homeTeam : AwayTeam;
      updateScore(winingTeam, scores);
      if (scores.get(winingTeam) > scores.get(currentBestTeam)) {
        currentBestTeam = winingTeam;
      }

      System.out.println(homeTeam);
      System.out.println(AwayTeam);
    }
    return currentBestTeam;
  }

  private static void updateScore(String currentWiningTeam, HashMap<String, Integer> scores) {

    if (!scores.containsKey(currentWiningTeam)) {
      scores.put(currentWiningTeam, 0);

    }
    // Wining Team gets 3 points
    scores.put(currentWiningTeam, scores.get(currentWiningTeam) + 3);

  }

  public static void main(String[] args) {
    ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
    ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
    ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
    ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
    competitions.add(competition1);
    competitions.add(competition2);
    competitions.add(competition3);
    ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
    var actual = tournamentWinner(competitions, results);
    System.out.println("And the winner is");
    System.out.println(actual);
  }

}

//This exercise from Hackerrank: https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int aliceScore = 0;
    int bobScore = 0;
    List<Integer> score = Arrays.asList(aliceScore, bobScore);

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) < b.get(i)) {
        score.set(1, score.get(1) + 1);
      }
      else if (a.get(i) > b.get(i)) {
        score.set(0, score.get(0) + 1);
      }

    }
    //System.out.println("score: " + score);
    return score;
  }

  public static void main(String args[]) {
    List<Integer> a = Arrays.asList(17, 28, 30);
    List<Integer> b = Arrays.asList(99, 16, 8);

    CompareTheTriplets compareTheTriplets = new CompareTheTriplets();
    compareTheTriplets.compareTriplets(a, b);
  }
}

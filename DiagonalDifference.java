//This exercise is from Hackerrank: https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

import java.util.List;

public class DiagonalDifference {
  public static int diagonalDifference(List<List<Integer>> arr) {
    int n = arr.size();
    int leftDiagonalSum = 0;
    int rightDiagonalSum = 0;
    for (int i = 0; i < n; i++) {
      leftDiagonalSum += arr.get(i).get(i);
      rightDiagonalSum += arr.get(i).get(n - 1 - i);
    }

    return Math.abs(rightDiagonalSum - leftDiagonalSum);
  }
}

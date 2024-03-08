//This exercise from Hackerrank: https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true

public class SolveMeFirst {
  public int solveMeFirst(int a, int b) {
    int sum = 0;
    if (a < 1 || a > 1000) {
      return 0;
    }
    if (b < 1 || b > 1000) {
      return 0;
    }
    sum = a + b;
    return sum;
  }
  public static void main(String args[]) {
    SolveMeFirst solveMeFirst = new SolveMeFirst();
    solveMeFirst.solveMeFirst(2, 5);
  }
}

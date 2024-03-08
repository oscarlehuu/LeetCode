//This exercise is from Hackerrank: https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

public class Staircase {
  public static void staircase(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= n - i + 1; j ++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i - 1; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    Staircase staircase = new Staircase();
    staircase.staircase(6);
  }
}

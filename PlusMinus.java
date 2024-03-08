//this exercise is from Hackerrank: https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
  public static void plusMinus(List<Integer> arr) {
    int n = arr.size();
    int postiveNumberCount = 0;
    int negativeNumberCount = 0;
    int zeroCount = 0;
    for (Integer number: arr) {
      if (number > 0 ) {
        postiveNumberCount += 1;
      } else if (number < 0 ) {
        negativeNumberCount += 1;
      } else if (number == 0) {
        zeroCount += 1;
      }

    }

    System.out.format(" %.6f \n", (float) postiveNumberCount / n);
    System.out.format(" %.6f \n", (float) negativeNumberCount / n);
    System.out.format(" %.6f \n", (float) zeroCount / n);
  }

  public static void main(String args[]) {
    List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
    
    PlusMinus plusMinus = new PlusMinus();
    plusMinus.plusMinus(arr);
  }
}

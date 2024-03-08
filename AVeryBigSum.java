//This exercise from Hackerrank: https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {
  public static long aVeryBigSum(List<Long> ar) {
    long sum = 0;
    for (long number: ar) {
      sum += number;
    }

    System.out.println("Sum: " + sum);
    return sum;
  }

  public static void main(String args[]) {
    List<Integer> arr = Arrays.asList(1000000001, 1000000002, 1000000003, 1000000004, 1000000005);
    List<Long> ar = new ArrayList<>();

    for (Integer number: arr) {
      ar.add(number.longValue());
    }

    AVeryBigSum aVeryBigSum = new AVeryBigSum();
    aVeryBigSum.aVeryBigSum(ar);
  }
}

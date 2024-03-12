//this exercise is from hackerrank: https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
  public static void miniMaxSum(List<Integer> arr) {
    Collections.sort(arr);
    
    long minSum = arr.stream().limit(4).mapToLong(Integer::longValue).sum();

    long maxSum = arr.stream().skip(arr.size() - 4).mapToLong(Integer::longValue).sum();

    System.out.println(minSum + " " + maxSum);
  }

  public static void main(String args[]) {
    List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
    MinMaxSum minMaxSum = new MinMaxSum();
    minMaxSum.miniMaxSum(arr);
  }
}

//This exercise is from Hackerrank: https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {
  public static int simpleArraySum(List<Integer> ar) {
    int sum = 0;
    if (ar == null) {
      return 0;
    }

    for (int i : ar) {
      sum += i;
    }
    return sum;
  }

  public static void main(String args[]) {
    SimpleArraySum simpleArraySum = new SimpleArraySum();
    List<Integer> myList = Arrays.asList(1, 2, 3);
    simpleArraySum.simpleArraySum(myList);
  }
}

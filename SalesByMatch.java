//this exercise is from: https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
  public static int sockMerchant(int n, List<Integer> ar) {
    Map<Integer, Integer> sockCounts = new HashMap<>();

    for (int sock: ar) {
      sockCounts.put(sock, sockCounts.getOrDefault(sock, 0) + 1);
    }

    int pairCount = 0;
    for (int sockCount: sockCounts.values()) {
      if (sockCount >= 2) {
        pairCount += sockCount / 2;
      }
    }
    System.out.println(pairCount);
    return pairCount;
  }

  public static void main(String args[]) {
    List<Integer> sock = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
    SalesByMatch salesByMatch = new SalesByMatch();
    salesByMatch.sockMerchant(9, sock);
  }
}

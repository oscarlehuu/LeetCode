//this exercise is from: https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

import java.util.Arrays;
import java.util.Collections;

public class ElectronicsShop {
  public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    Arrays.sort(keyboards);
    Arrays.sort(drives);

    int cost = -1;
    
    for (int i = keyboards.length - 1; i >= 0; i--) {
      if (keyboards[i] >= b) {
        continue;
      }
      for (int j = drives.length - 1; j >= 0; j--) {
        int total = keyboards[i] + drives[j];
        if (total <= b && total > cost) {
          cost = total;
        }
      }
    }

    System.out.println(cost);
    return cost;
  }

  public static void main(String args[]) {
    int[] keyboards = {2, 3, 3};
    int[] drives = {1, 5, 2, 8};
    
    ElectronicsShop electronicsShop = new ElectronicsShop();
    electronicsShop.getMoneySpent(keyboards, drives, 10);
  }
}

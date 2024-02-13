import java.util.ArrayList;

// You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.

// Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.

public class ThekthFactorOfn {
  public int kthFactor(int n, int k) {
    ArrayList<Integer> factors = new ArrayList<>();
    if (1 <= k && k <= n && n <= 1000 ) {
      for (int i = 1 ; i <= n / 2; i++) {
        if (n % i == 0) {
          factors.add(i);
        }
      }
      factors.add(n);
      return factors.size() < k ? -1 : factors.get(k-1);
    } else {
      return -1;
    }
  }
  public static void main(String args[]) {
    ThekthFactorOfn t = new ThekthFactorOfn();
    System.out.println(t.kthFactor(999, 1001));
  }
}

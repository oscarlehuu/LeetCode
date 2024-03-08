// A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

// Given an integer n, return true if n is a perfect number, otherwise return false.

import java.util.ArrayList;

public class PerfectNumber {
  public boolean checkPerfectNumber(int num) {
    if (num <= 0 || num % 2 != 0) {
      return false; // Negative or odd numbers cannot be perfect
  }

  int sum = 1; // Include 1 as a divisor
  for (int i = 2; i * i <= num; i++) { // Check only up to the square root
      if (num % i == 0) {
          sum += i; // Add both divisor and its pair (if different)
          if (i * i != num) { // Avoid double counting the perfect square
              sum += num / i;
          }
      }
  }

  return sum == num;
  }

  public static void main(String args[]) {
    PerfectNumber perfectNumber = new PerfectNumber();
    System.out.println(perfectNumber.checkPerfectNumber(28));
  }
}

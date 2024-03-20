public class PowerofFour {
  public boolean isPowerOfFour(int n) {
    if (n <= 0) return false;

    while (n % 4 == 0) {
      n /= 4;
    }

    return n == 1;
  }

  public static void main(String args[]) {
    PowerofFour powerofFour = new PowerofFour();
    System.out.println(powerofFour.isPowerOfFour(16));
  }
}

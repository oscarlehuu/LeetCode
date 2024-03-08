public class PowerofTwo {
  public boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false;
    }

    return (n & (n-1)) == 0;
  }
  
  public static void main(String args[]) {
    PowerofTwo powerofTwo = new PowerofTwo();
    System.out.println(powerofTwo.isPowerOfTwo(3));
  }
}

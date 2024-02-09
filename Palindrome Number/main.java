public class main {
  public boolean isPalindrom(int x) {
    int sign = Integer.signum(x);
    x = Math.abs(x);

    String originalNumberToString = Integer.toString(x);
    char[] originalNumberToCharArray = originalNumberToString.toCharArray();

    for (int i = 0; i < originalNumberToCharArray.length / 2; i++) {
      char temp = originalNumberToCharArray[i];
      originalNumberToCharArray[i] = originalNumberToCharArray[originalNumberToCharArray.length - 1 - i];
      originalNumberToCharArray[originalNumberToCharArray.length - 1 - i] = temp;
    }

    String reversedNumberToString = new String(originalNumberToCharArray);
    try {
      long reversedInt = Long.parseLong(reversedNumberToString)*sign;
      return reversedInt == x;
    } catch (NumberFormatException e) {
      return false;
    }
  }
  public static void main(String[] args) {
    main m = new main();
    System.out.println(m.isPalindrom(1234567899));
  }
}
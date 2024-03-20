public class BeautifulDays {
  public static int beautifulDays(int i, int j, int k) {
    int count = 0;
    for (int day = i; day <= j; day++) {
      String dayStr = Integer.toString(day);
      char[] dayStrArr = dayStr.toCharArray();
      String dayStrReversed = "";
      for (int index = dayStrArr.length - 1; index >= 0; index--) {
        System.out.println("Index: " + index + ", char: " + dayStrArr[index]);
        dayStrReversed += dayStrArr[index];
      }
      System.out.println("String of Day Reserved: " + dayStrReversed);
      System.out.println("---------");
      int dayReversed = Integer.parseInt(dayStrReversed);
      if(Math.abs(day - dayReversed) % k == 0) {
        count++;
      }
    }
    System.out.println("Beautiful Day counts: " + count);
    return count;
  }

  public static void main(String args[]) {
    BeautifulDays beautifulDays = new BeautifulDays();
    beautifulDays.beautifulDays(20, 23, 6);
  }
}

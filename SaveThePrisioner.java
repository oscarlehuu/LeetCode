public class SaveThePrisioner {
  public static int saveThePrisioner(int n, int m, int s) {
    // if m (Candy) < n (Prisioners) and s (start position) = 1 -> warned prisioner: m (Candy)
    int warnedPrisioner = 0;
    if (m < n && s == 1) return m;
    if (m < n && s < n) return s + 1;
    if (m < n && s == n) return 1;
    // if m (Candy) > n (Prisioners) -> after first round, we always start at the first prisioner with lefover candy -> warn prisioner: lefover + 1
    int leftover = 0;
    if (m > n && s != n) {
      leftover = m - n;
      if (leftover > n) {
        leftover -= n;
      }
      warnedPrisioner = leftover + 1;   
    } else if (m > n && s == n) {
      leftover = m - n;
      if (leftover > n) {
        leftover -= n;
      }
      warnedPrisioner = leftover + 2;  
    }
    return warnedPrisioner; 
  }

  public static void main(String args[]) {
    System.out.println(saveThePrisioner(3, 7, 3));
  }
}

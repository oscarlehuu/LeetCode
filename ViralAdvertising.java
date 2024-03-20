public class ViralAdvertising {
  public static int viralAdvertising(int n) {
    final int MAX_LIKE = 2;
    final int MAX_SHARED = 3;
    int shared = 5;
    int liked = 0;
    int cumulative = 0;
    for (int i = 1; i <= n; i++) {
      liked = (int)Math.floor(shared / MAX_LIKE);
      cumulative += liked;
      shared = liked * MAX_SHARED;
    }
    System.out.println(cumulative);
    return cumulative;
  }
  
  public static void main(String args[]) {
    int n = 3;
    ViralAdvertising viralAdvertising = new ViralAdvertising();
    viralAdvertising.viralAdvertising(n);
  }
}

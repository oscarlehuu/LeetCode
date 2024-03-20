import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
  public static String angryProfessor (int k, List<Integer> a) {
    String isCancelled = "";
    int count = 0;
    for (int num : a) {
      if (num <= 0) {
        count++;
      } else {
        count = count;
      }
    }
    if (count >= k) {
      isCancelled = "NO";
    } else {
      isCancelled = "YES";
    }
    System.out.println(count);
    System.out.println(isCancelled);
    return isCancelled;
  }
  public static void main(String args[]) {
    int k = 5;
    List<Integer> a = Arrays.asList(-2, -1, 0, 1, 2);
    AngryProfessor angryProfessor = new AngryProfessor();
    angryProfessor.angryProfessor(k, a);
  }
}

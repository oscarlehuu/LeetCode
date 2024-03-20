import java.util.Arrays;
import java.util.HashSet;

public class AssignCookies {
  public int findContentChildren(int[] g, int[] s) {
    int maximumContent = 0;

    Arrays.sort(g);
    Arrays.sort(s);

    HashSet<Integer> hashSetOfs  = new HashSet<>();

    for (int size : s) {
      hashSetOfs.add(size);
    }

    for (int i = g.length - 1; i >= 0; i--) {
      System.out.println(g[i]);
      System.out.println("------------");
      if (hashSetOfs.contains(g[i])) {
        maximumContent = g[i];
        break;
      }
    }
    System.out.println(maximumContent);
    return maximumContent;
  }
  public static void main(String args[]) {
    int[] g = { 1, 2 };
    int[] s = { 1, 2, 3 };

    AssignCookies assignCookies = new AssignCookies();
    assignCookies.findContentChildren(g, s);
  }
}

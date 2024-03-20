public class UtopianTree {
  public static int utopianTree(int n) {
    int height = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) height += 1;
      if (i %2 != 0) height *= 2;
      System.out.println("i = " + i + ", height: " + height);
    }
    System.out.println(height);
    return height;
  }

  public static void main(String args[]) {
    int n = 5;

    UtopianTree utopianTree = new UtopianTree();
    utopianTree.utopianTree(n);
  }
}

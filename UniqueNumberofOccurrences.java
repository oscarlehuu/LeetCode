import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
  public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    HashSet<Integer> frequencies = new HashSet<>();

    for (int num : arr) {
      hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
    }

    System.out.println("Hash Map: ");
    System.out.println(hashMap);
    System.out.println("---------");

    for (int num : hashMap.values()) {
      if (!frequencies.add(num)) {
        return false;
      }
    }

    return true;
  }

  public static void main(String args[]) {
    int[] arr = { 26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16 };
    UniqueNumberofOccurrences uniqueNumberofOccurrences = new UniqueNumberofOccurrences();
    uniqueNumberofOccurrences.uniqueOccurrences(arr);
  }
}

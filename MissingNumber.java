import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
  public int missingNumber(int[] nums) {
    int result = 0;
    Arrays.sort(nums);
    HashSet<Integer> numsSet = new HashSet<>();
    for (int num : nums) {
      numsSet.add(num);
    }

    int[] nums2 = new int[nums.length];
    for (int i = 0; i <= nums2.length; i++) {
      System.out.println("i: " + i);
      System.out.println("--------");
      if (!numsSet.contains(i)) {
        result = i;
      }
    }
    System.out.println(result);
    return result;
  }

  public static void main(String args[]) {
    int[] nums = { 0,1 };
    MissingNumber missingNumber = new MissingNumber();
    missingNumber.missingNumber(nums);
  }
}


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MinimumCommonValue {
  public int getCommon(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>();
    int minCommon = Integer.MAX_VALUE;
    for (int num : nums1) {
      set1.add(num);
    }

    System.out.println(set1);

    for (int num : nums2) {
      if (set1.contains(num) && num < minCommon) {
        minCommon = num;
      }
    }

    return minCommon == Integer.MAX_VALUE ? -1 : minCommon;
  }

  public static void main(String args[]) {
    int[] nums1 = { 1, 2, 4};
    int[] nums2 = {2, 4};
    MinimumCommonValue minimumCommonValue = new MinimumCommonValue();
    System.out.println(minimumCommonValue.getCommon(nums1, nums2));
  }
}

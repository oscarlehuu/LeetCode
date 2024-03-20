import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> numberMap = new HashMap<>();
    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (numberMap.containsKey(complement)) {
        result[0] = numberMap.get(complement);
        result[1] = i;
        return result;
      }
      numberMap.put(nums[i], i);
    }

    return null;
  }
}

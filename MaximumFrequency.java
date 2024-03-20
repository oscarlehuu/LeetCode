import java.util.Arrays;
import java.util.HashMap;

public class MaximumFrequency {
  public int maxFrequencyElements(int[] nums) {
    Arrays.sort(nums);
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int maxValue = 0;
    int countMaxValueAppear = 0;
    int totalMaxFrequency = 0;
    for (int num : nums) {
      hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
    }

    for (int key : hashMap.keySet()) {
      int count = hashMap.get(key);
      if (count > maxValue) {
        maxValue = count;
        totalMaxFrequency = maxValue;
      } else if (count == maxValue) {
        totalMaxFrequency += maxValue;
      }
    }
    return totalMaxFrequency;
  }
  
  public static void main(String args[]) {
    int[] nums = { 10,12,11,9,6,19,11 };
    MaximumFrequency maximumFrequency = new MaximumFrequency();
    maximumFrequency.maxFrequencyElements(nums);
  }
}

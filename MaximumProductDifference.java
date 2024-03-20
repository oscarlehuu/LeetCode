import java.util.Arrays;

public class MaximumProductDifference {
  public int maxProductDifference(int[] nums) {
    Arrays.sort(nums);
    int max =  (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[1] * nums[0]);
    System.out.println(max);
    return max;
  }

  public static void main(String args[]) {
    int[] nums = { 5,6,2,7,4 };
    MaximumProductDifference maximumProductDifference = new MaximumProductDifference();
    maximumProductDifference.maxProductDifference(nums);
  }
}

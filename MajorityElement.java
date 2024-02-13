// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

public class MajorityElement {
  public int majorityElement(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int minAppear = (int) Math.floor(nums.length / 2);
    
    for (int i = 0; i <= nums.length - 1; i++) {
      int count = 0;
      for (int j = 0; j <= nums.length - 1; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count > minAppear) {
        return nums[i];
      }
    }
    return -1;
  }
  public static void main(String args[]) {

  }
}

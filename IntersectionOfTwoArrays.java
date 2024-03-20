import java.util.HashSet;

public class IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> nums1Set = new HashSet<>();
    for (int num : nums1) {
      nums1Set.add(num);
    }

    HashSet<Integer> intersection = new HashSet<>();
    for(int num : nums2) {
      if (nums1Set.contains(num)) {
        intersection.add(num);
      }
    }

    int[] result = new int[intersection.size()];
    int i = 0;
    for (int num : intersection) {
      result[i++] = num;
    }
    return result;
  }
  public static void main(String args[]) {
    int[] num1 = { 1,2,2,1 };
    int[] num2 = { 2,2 };
    IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
    intersectionOfTwoArrays.intersection(num1, num2);
  }
}

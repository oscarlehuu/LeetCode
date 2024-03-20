public class PivotNumber {
  public int pivotInteger(int n) {
    if (n == 1) return 1;

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = i + 1;
    }
    
    int left = 1;
    int right = nums[n - 1];

    while (left < right) {
      int mid = left + (right - left) / 2;
      int sumLeftToMid = 0; 
      for (int i = 0; i < mid; i++) {
        sumLeftToMid += nums[i]; 
      }

      int sumMidToRight = 0;
      for (int i = mid + 1; i < n; i++) {
        sumMidToRight += nums[i]; 
      }

      if (sumLeftToMid == sumMidToRight) {
        return mid + 1; 
      } else if (sumLeftToMid < sumMidToRight) {
          left = mid + 1; 
      } else {
          right = mid;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    PivotNumber pivotNumber = new PivotNumber();
    System.out.println(pivotNumber.pivotInteger(1));
  }
}

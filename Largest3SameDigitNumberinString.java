import java.util.HashMap;

public class Largest3SameDigitNumberinString {
  public String largestGoodInteger(String num) {
    String largest = "";  
        int i = 0; // Start of the sliding window
        int j = 0; // End of the sliding window

        while (j < num.length()) {
            // Expand window while the characters are the same
            while (j < num.length() && num.charAt(i) == num.charAt(j)) {
                j++;
            }

            // Check if we have a good substring (length 3)
            if (j - i == 3) {
                String current = num.substring(i, j);
                largest = (current.compareTo(largest) > 0) ? current : largest;  
            }

            // Slide the window by moving the 'i' pointer
            i = j; 
        }

        return largest;
  }

  public static void main(String args[]) {
    String num = "42352338";
    Largest3SameDigitNumberinString largest3SameDigitNumberinString = new Largest3SameDigitNumberinString();
    largest3SameDigitNumberinString.largestGoodInteger(num);
  }
}

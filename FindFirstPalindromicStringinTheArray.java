// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

// A string is palindromic if it reads the same forward and backward.

public class FindFirstPalindromicStringinTheArray {
  public String firstPalindrom(String[] words) {
      if (words.length >= 1 && words.length <= 100) {
          for (int i = 0; i <= words.length - 1; i ++) {
              if (words[i].length() >= 1 && words[i].length() <= 100) {
                  boolean isPalindrome = true;
                  for (int j = 0 ; j <= words[i].length() / 2; j++) {
                      if (words[i].charAt(j) != words[i].charAt(words[i].length() - 1 - j)) {
                          isPalindrome = false;
                          break;
                      }
                  }
                  if (isPalindrome) {
                      return words[i];
                  }
              }
          }
      }
      return "";
  }

  public static void main(String args[]) {
      // Test the function with some inputs
      FindFirstPalindromicStringinTheArray finder = new FindFirstPalindromicStringinTheArray();
      System.out.println(finder.firstPalindrom(new String[]{"abc", "aba", "xyz"})); // Should print "aba"
  }
}
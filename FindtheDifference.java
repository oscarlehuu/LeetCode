// You are given two strings s and t.

// String t is generated by random shuffling string s and then add one more letter at a random position.

// Return the letter that was added to t.

public class FindtheDifference {
  public char findTheDifference(String s, String t) { 
    int[] sArr = new int[26];
    int[] tArr = new int[26];
    for (int i = 0; i < s.length(); i++) {
      sArr[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < t.length(); i++) {
      tArr[t.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (sArr[i] != tArr[i]) {
        return (char) (i + 'a');
      }
    }
    return ' ';
  }
  public static void main(String args[]) {

  }
}

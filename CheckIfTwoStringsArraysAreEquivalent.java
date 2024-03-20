public class CheckIfTwoStringsArraysAreEquivalent {
  public boolean arrayStringAreEqual(String[] word1, String[] word2) {
    boolean isEqual = false;
    String word1Str = "";
    String word2Str = "";

    for (String word : word1) {
      word1Str += word;
    }

    for (String word : word2) {
      word2Str += word;
    }

    if (word1Str.equals(word2Str)) {
      isEqual = true;
    }
    return isEqual;
  }

  public static void main(String args[]) {
    String[] word1 = { "abc", "d", "defg" };
    String[] word2 = { "abcddefg" };
    CheckIfTwoStringsArraysAreEquivalent checkIfTwoStringsArraysAreEquivalent = new CheckIfTwoStringsArraysAreEquivalent();
    checkIfTwoStringsArraysAreEquivalent.arrayStringAreEqual(word1, word2);
  }
}
// Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

// Return the minimum number of substrings in such a partition.

// Note that each character should belong to exactly one substring in a partition.

public class OptimalPartitionofString {
  public int minPartitions(String s) {
    if (s.length() == 0 || s.length() < 1 || s.length() > Math.pow(10,5)) {
        return 0;
    } else {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        int partitions = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);
            if (i == end) {
                partitions++;
            }
        }
        return partitions;
    }
}
  
  public static void main(String args[]) {
  }
}

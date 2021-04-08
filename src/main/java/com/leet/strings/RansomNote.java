package com.leet.strings;

public class RansomNote {

  public boolean canConstruct(String ransomNote, String magazine) {
    int[] arr = new int[26];
    for (char c : magazine.toCharArray()) {
      arr[c - 'a'] = arr[c - 'a'] + 1;
    }

    for (char c : ransomNote.toCharArray()) {

      if (arr[c - 'a'] > 0) {
        arr[c - 'a'] = arr[c - 'a'] - 1;
      } else {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    String ransomNote = "aa";
    String magazine = "aab";
    RansomNote rn = new RansomNote();
    boolean res = rn.canConstruct(ransomNote, magazine);
    System.out.println(res);


    ransomNote = "aa";
    magazine = "ab";

    res = rn.canConstruct(ransomNote, magazine);
    System.out.println(res);

  }
}

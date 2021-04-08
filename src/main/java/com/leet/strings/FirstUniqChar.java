package com.leet.strings;

public class FirstUniqChar {
  public int firstUniqChar(String s) {
    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) count[s.charAt(i) - 'a']++;

    for (int i = 0; i < s.length(); i++) if (count[s.charAt(i) - 'a'] == 1) return i;

    return -1;
  }

  public static void main(String[] args) {
    //
    FirstUniqChar fuc = new FirstUniqChar();
    int res = fuc.firstUniqChar("loveleetcode");
    System.out.println(res);
  }
}
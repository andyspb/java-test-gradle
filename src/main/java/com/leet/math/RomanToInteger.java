package com.leet.math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
  public int romanToInt(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    Map<Character, Integer> romanValues = new HashMap<>();
    romanValues.put('I', 1);
    romanValues.put('V', 5);
    romanValues.put('X', 10);
    romanValues.put('L', 50);
    romanValues.put('C', 100);
    romanValues.put('D', 500);
    romanValues.put('M', 1000);

    int length = s.length();
    int result = romanValues.get(s.charAt(length - 1));
    for (int i = length - 2; i >= 0; i--) {
      if (romanValues.get(s.charAt(i)) >= romanValues.get(s.charAt(i + 1))) {
        result += romanValues.get(s.charAt(i));
      } else {
        result -= romanValues.get(s.charAt(i));
      }
    }
    return result;
  }

  public static void main(String[] args) {
    RomanToInteger pti = new RomanToInteger();
    String roman = "LVIII";
    int num = pti.romanToInt(roman);
    System.out.println(num);
  }
}

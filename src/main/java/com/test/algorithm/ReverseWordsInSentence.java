package com.test.algorithm;

public class ReverseWordsInSentence {

  public static String reverseWord(String sentence) {
    String words[] = sentence.split("\\s");
    String reverseWords = "";
    for (String w : words) {
      StringBuilder sb = new StringBuilder(w);
      sb.reverse();
      reverseWords += sb.toString() + " ";
    }
    return reverseWords.trim();
  }

  public static void main(String[] args) {
    String sentence = "Hello my frieands";
    System.out.println(sentence);

    String rev = reverseWord(sentence);

    System.out.println(rev);
  }
}

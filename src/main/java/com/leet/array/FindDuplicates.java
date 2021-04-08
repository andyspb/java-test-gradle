package com.leet.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

  public static void main(String[] args) {

    int[] arr = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};

    System.out.println(Arrays.toString(arr));

    Set<Integer> set = new HashSet<>();
    for(int i = 0; i<arr.length; ++i) {
      set.add(arr[i]);
    }


    System.out.println("Duplicate elements in given array: ");
    //Searches for duplicate element
    for(int i = 0; i < arr.length; i++) {
      for(int j = i + 1; j < arr.length; j++) {
        if(arr[i] == arr[j])
          System.out.println(arr[j]);
      }
    }

    System.out.println(Arrays.toString(set.toArray()));
  }
}

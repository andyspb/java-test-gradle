package com.test.algorithm;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShellSort {
  private static final Logger log = Logger.getLogger(ShellSort.class.getName());

  int sort(int arr[]) {
    int len = arr.length;

    // Start with a big gap, then reduce the gap
    for (int gap = len / 2; gap > 0; gap /= 2) {
      // Do a gapped insertion sort for this gap size.
      // The first gap elements a[0..gap-1] are already
      // in gapped order keep adding one more element
      // until the entire array is gap sorted
      for (int i = gap; i < len; i += 1) {
        // add a[i] to the elements that have been gap
        // sorted save a[i] in temp and make a hole at
        // position i
        int temp = arr[i];

        // shift earlier gap-sorted elements up until
        // the correct location for a[i] is found
        int j;
        for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) arr[j] = arr[j - gap];

        // put temp (the original a[i]) in its correct
        // location
        arr[j] = temp;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    log.log(Level.INFO, ">>>");

    int arr[] = {12, 34, 54, 2, 3};
    System.out.println("Array before sorting");
    printArray(arr);

    ShellSort ob = new ShellSort();
    ob.sort(arr);

    System.out.println("Array after sorting");
    printArray(arr);
    log.log(Level.INFO, "<<<");
  }

  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
    System.out.println();
  }
}

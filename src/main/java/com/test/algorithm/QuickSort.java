package com.test.algorithm;

import java.util.Arrays;
import java.util.logging.Logger;

public class QuickSort {
  private static Logger LOGGER = Logger.getLogger(QuickSort.class.getName());

  public static void quickSort(int[] arr, int low, int high) {
    if (arr == null || arr.length <= 1) {
      return;
    }

    if (low >= high) {
      return;
    }

    int piv = low + (high - low) / 2;
    int i = low, j = high;

    while (i < j) {
      while (i < piv && arr[i] <= arr[piv]) ++i;
      while (j > piv && arr[j] >= arr[piv]) --j;
      if (i < j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
      }

      if (piv == i) piv = j;
      else if (piv == j) piv = i;
    }
    quickSort(arr, low, piv);
    quickSort(arr, piv + 1, high);
  }

  //  private static void swap(int[] arr, int i, int j) {
  //    int temp = arr[i];
  //    arr[i] = arr[j];
  //    arr[j] = temp;
  //  }

  public static void main(String[] args) {
    LOGGER.info(">>>");
    int[] arr = {1, 3, 5, 6, 2, 8, 0};
    System.out.println(Arrays.toString(arr));
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));

    int[] arr1 = {8, 3, 22, -1, 15, 8, 0, 3};
    System.out.println(Arrays.toString(arr1));
    quickSort(arr1, 0, arr1.length - 1);
    System.out.println(Arrays.toString(arr1));
  }
}

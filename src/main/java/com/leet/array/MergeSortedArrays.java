package com.leet.array;

import java.util.Arrays;

public class MergeSortedArrays {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (k >= 0) {
      if (j < 0 || (i >= 0 && nums1[i] > nums2[j])) nums1[k--] = nums1[i--];
      else nums1[k--] = nums2[j--];
    }
  }

  public static void main(String[] args) {
    int[] nums1 = new int[] {1, 2, 3, 0, 0, 0}; // m = 3
    int[] nums2 = new int[] {2, 5, 6}; // 3

    MergeSortedArrays msa = new MergeSortedArrays();
    msa.merge(nums1, 3, nums2, 3);

    System.out.println(Arrays.toString(nums1));
  }
}

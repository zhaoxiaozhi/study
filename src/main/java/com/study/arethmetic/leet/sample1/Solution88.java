package com.study.arethmetic.leet.sample1;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 */
public class Solution88 {

    public static void merge1(int[] nums1, int m, int[] nums2, int n){

        int[] nums1_copy = new int[m];
        System.arraycopy(nums1,0,nums1_copy,0,m);
        int p1 = 0;
        int p2 = 0;
        int p = 0;

        while ((p1 < m) && (p2 < n)){
            nums1[p++] = (nums1_copy[p1] < nums2[p2] ? nums1_copy[p1++] : nums2[p2++]);
            if (p1 < m){
                System.arraycopy(nums1_copy,p1,nums1, p1 + p2, n + m - p1 -p2);
            }
            if (p2 < n){
                System.arraycopy(nums2, p2, nums1, p1+p2, n + m - p1 - p2);
            }
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n){

         int p1 = m - 1;
         int p2 = n - 1;
         int p = m + n - 1;
         while ((p1 >= 0) && (p2 >= 0))
             nums1[p --] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
         System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1,5,8};
        int[] b = new int[]{2,6,9};
        merge1(a,4,b,3);
    }
}

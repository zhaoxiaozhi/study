package com.study.arethmetic.leet.sample1;

/**
 * 动态规划  数组操作
 * 打家劫舍
 */
public class Solution198 {

    public int rob(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        int[] dp = new int[len];
        dp[0] = dp[1];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {

            dp[i] = Math.max(dp[i - 2] + nums[i], nums[i - 1]);
        }
        return dp[len - 1];
    }

}

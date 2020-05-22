package com.study.arethmetic.javaguide;

/**
 *  LeetCode: 最长回文子串 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 *
 *  输入: "babad"
 输出: "bab"
 注意: "aba"也是一个有效答案。

 输入: "cbbd"
 输出: "bb"
 */
public class LongestPalindromeSon {

    private int index, len;

    /**
     * 以某个元素为中心，分别计算偶数长度的回文最大长度和奇数长度的回文最大长度
     * @param s
     * @return
     */
    public String longestPalindrome(String s){

        if (s.length() < 2){
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++){
              palindromeHelper(s,i,i);
              palindromeHelper(s,i,i+ 1);
        }
        return s.substring(index, index + len);

    }

    public void palindromeHelper(String s, int l, int r){

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        if (len < r - l - 1){
            index = l + 1;
            len = r - l - 1;
        }

    }
}

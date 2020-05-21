package com.study.arethmetic;

import java.util.HashSet;

/**
 *给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 在构造过程中，请注意区分大小写。比如"Aa"不能当做一个回文字符串。
 * 注 意:假设字符串的长度不会超过 1010。
 *回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串
 *
 *
 */
public class LongestPalindrome {

    public int longestPalindrome(String s){

        if (s.length() == 0) {
        return 0;
        }

        HashSet<Character> hashSet = new HashSet<>();
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++){
            if (!hashSet.contains(chars[i])){
                hashSet.add(chars[i]);
            }else {
               hashSet.remove(chars[i]);
               count++;
            }
        }
        return hashSet.isEmpty() ? count * 2 : count * 2 + 1;

    }

}

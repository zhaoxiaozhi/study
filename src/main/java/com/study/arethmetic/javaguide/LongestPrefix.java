package com.study.arethmetic.javaguide;

import java.util.Arrays;

/**
 *  编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 *输入: ["flower","flow","flight"]
 输出: "fl"
 *
 * 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 */

public class LongestPrefix {

    /**
     * 思路很简单！先利用Arrays.sort(strs)为数组排序，再将数组第一个元素和最后一个元素的字符从前往后对比即可！
     * @param strs
     * @return
     */
    public static String replaceSpace(String[] strs){


        if (checkStrs(strs)){
            return "";
        }
        //数组长度
        int len = strs.length;
        StringBuilder res = new StringBuilder();
// 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前面)
        Arrays.sort(strs);
        int m = strs[0].length();
        int n = strs[len - 1].length();
        int num = Math.min(m,n);
        for (int i = 0; i < num; i++){
            if (strs[0].charAt(i) == strs[len-1].charAt(i)){
                res.append(strs[0].charAt(i));
            }else
                break;;
        }
        return res.toString();
    }


    private static boolean checkStrs(String[] strs){

        boolean flag = false;
        if (strs != null){
            //遍历检查元素值
            for (int i = 0; i < strs.length; i++){
                if (strs[i] != null && strs[i].length() != 0){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }

        }
        return flag;
    }

}

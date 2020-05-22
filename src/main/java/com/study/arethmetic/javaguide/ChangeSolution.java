package com.study.arethmetic.javaguide;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ChangeSolution {
    /***
     * 第一种方法：常规方法。利用String.charAt(i)以及String.valueOf(char).equals(" "
     * )遍历字符串并判断元素是否为空格。是则替换为"%20",否则不替换
     * @param str
     * @return
     */

    public static String replaceSpace(StringBuffer str){

        int length = str.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++){

            char b = str.charAt(i);
            if (String.valueOf(b).equals(" ")){
                result.append("%20");
            }else {
                result.append(b);
            }
        }
        return result.toString();
    }

    public static String replaceApace(StringBuffer str){
        return str.toString().replaceAll("\\s", "%20");
    }



}


package com.study.offer.array;

public class MinNumberInRotateArray {


    /**
     * 二分查找法
     * @param array
     * @return
     */
    public int minNUmberInArray(int[] array){

        int len = array.length;
        if (len == 0){
            return 0;
        }
        int low = 0, high = len - 1;
        if (array[low] < array[high]){
            return array[low];   //本身
        }
        while (low < high){
          int mid = low + (high - low) /2;
          if (array[low] == array[mid] && array[high] == array[mid]){
              return minInOrder(array);
          }

          if (array[mid] >= array[low]){
              low = mid;
          }else if (array[high] >= high){
              high = mid;
          }
          if (high - low == 1){
              return array[high];
          }
        }
      return -1;

    }

    public int minInOrder(int[] array){
        int min = array[0];
        for (int num : array){
            if (num < min){
                min = num;
            }
        }
        return min;
    }


}

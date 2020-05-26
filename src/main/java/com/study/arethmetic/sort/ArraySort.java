package com.study.arethmetic.sort;

public class ArraySort {

    private static int[] numArray = {5, 12, 2, 63, 22, 6, 54, 42};

    private static int count = numArray.length;

    //构造方法
    protected ArraySort() {
    }

    public static void main(String[] args) {
        InsertSort(numArray);
        for (int i = 0; i < count; i++) {

            System.out.print(numArray[i] + "\t");
        }
    }

    public static void SelectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //最大值的位置
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            swap(array, i, max);
        }
    }

    public static void BubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tem = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tem;

                }
            }
        }
    }

    public static void InsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                j--;
            }
        }
    }

    public void shellSort(int[] nums) {

        int gap = nums.length >> 1;
        while (gap > 0) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < nums.length; j += gap) {
                    int temp = j;
                    while (temp > i && nums[temp] < nums[temp - gap]) {
                        swap(nums, temp, temp - gap);
                        temp -= gap;
                    }
                }
            }
            gap >>= 1;
        }

    }

    //归并排序
    public static void mergeSort(int[] nums, int left, int right) {    // 需要左右边界确定排序范围

        if (left >= right)
            return;
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1;
        int cur = 0;
        while (i <= mid && j < right) {
            if (nums[i] <= nums[j])
                temp[cur] = nums[j++];
            else temp[cur] = nums[j++];
            cur++;
        }
        while (i <= mid) {
            temp[cur++] = nums[i++];
        }
        while (j <= right) {
            temp[cur++] = nums[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            nums[left + k] = temp[k];
        }
    }

    //快速排序
    private static void QuickSort(int[] nums, int left, int right) {

        if (left >= right)
            return;
        int lo = left + 1;
        int hi = right;
        while (lo <= hi) {
            if (nums[lo] > nums[left]) {
                swap(nums, lo, hi);
                hi--;
            } else {
                lo--;
            }
        }
        lo--;
        swap(nums, left, lo);
        QuickSort(nums, left, lo - 1);
        QuickSort(nums, lo + 1, right);
    }

    private static void quickSort2(int[] nums, int left, int right) {
        if (left >= right)
            return;
        int cur = left + 1;
        int lo = left;
        while (cur <= right) {
            if (nums[cur] < nums[left]) {
                swap(nums, lo + 1, cur);
                lo++;
            }
            cur++;
        }
        swap(nums, left, lo);                    //// 把分界点元素移动到新的分界位置
        quickSort2(nums, left, lo - 1);
        quickSort2(nums, lo + 1, right);
    }

    private void heapSort(int[]  nums){

        heapify(nums);
        for (int i = nums.length - 1; i >= 1; i --){
            swap(nums, 0, i);
            rebuildHeap(nums, 0, i - 1);
        }
    }

    private void heapify(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int par = (i - 1) >> 1; //找到父节点
            int child = i;
            while (child > 0 && nums[par] < nums[child]) {
                swap(nums, par, child);
                child = par;
                par = (par - 1) >> 1;
            }
        }
    }

    private void rebuildHeap(int[] nums, int par, int last){

        int left = 2 * par + 1;                      //左子节点
        int right = 2 * par + 2;                      //右子节点
        int maxIndex = left;
        if (right <= last && nums[right] > nums[left]){   //找到最大子节点
            maxIndex = right;
        }
        if(left <= last && nums[par] < nums[maxIndex]){          //和最大子节点比较
            swap(nums, par, maxIndex);                           //互换最大子节点
            rebuildHeap(nums, maxIndex, last);                   //重建最大子节点代表的子树
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}

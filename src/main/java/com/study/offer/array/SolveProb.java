package com.study.offer.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组中和为N的组合   动态规划   回溯算法
 */
public class SolveProb {

    public static void backTrack(int[] input, boolean[] visited, int n, int sum, int key, ArrayList<ArrayList<Integer>> lists){

      if (sum > key){
          return;
      }
      if ( sum == key){
          ArrayList<Integer> list = new ArrayList<>();
          for (int j = 0; j <= n; j++){
              if (visited[j]){
                  list.add(input[j]);
              }
          }
      }
      if (n >= input.length){
          return;
      }
      for (int i = n; i < input.length - 1; i++){
          if (!visited[i]){
              sum += input[i];
              visited[i] = true;
              backTrack(input, visited, i + 1, sum, key, lists);
              visited[i] = false;
              sum -= input[i];
              while(i < input.length - 1 && input[i] == input[i + 1]){
                  i++;
              }
          }

      }



    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5, 6, 7, 8, 9 };
        Arrays.sort(arr);
        int sum = 7;
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        boolean[] visited = new boolean[arr.length];
        backTrack(arr, visited, 0, 0, sum, lists);
        lists.forEach(e -> {
            System.out.println(e);
        });
    }

}

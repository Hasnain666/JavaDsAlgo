//Linear search in 2d arrays
package com.hasnain;

import java.util.Arrays;

public class searchIn2dArrays {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,78,99},
            {55,11,66,9},
            {77,52,6,99},
        };
        int target = 66;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] arr , int target){
        for (int row = 0; row< arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                if (arr[row][col] == target  ){
                    return new int[]{row,col};

                }
            }
        }
        return new int[]{-1,-1};

    }
}

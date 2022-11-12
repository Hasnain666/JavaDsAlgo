//Find the max element in the array and swap it with the last index
package com.hasnain;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the array and swap with the correct index
            int last  = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
         for (int i = start; i <=end ; i++) {
             if (arr[i] > arr[max]){
                 max = i;

             }
         }
        return max;
    }
}

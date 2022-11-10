//Bubble sort algorithm
package com.hasnain;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {

            //for each step the max item will come at the last respective index
            for(int j = 1; j < arr.length - i; j++){ //since at every pass the max item has already reached the last index so no need to check the last one
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }

}

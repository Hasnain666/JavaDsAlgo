// Use linear search algorithm to search 99 in the range 1 to 4
package com.hasnain;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {1,54,99,15,78,};
        int target = 99;
        System.out.println(linearSearch(arr,target,1,4));

    }
    static int linearSearch( int [] arr, int target,int start, int end){
        if (arr.length==0){
            return -1;
        }
        //for loop
        for(int index = start; index <=end; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        return -1;


    }
}

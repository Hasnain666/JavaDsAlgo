package com.hasnain;

public class floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floor(arr,target));

    }
    static int floor(int [] arr, int target){
        // if answer is found return it else return the greatest number smaller than or equal to the target
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else return mid;
        }
        return end;


    }
}

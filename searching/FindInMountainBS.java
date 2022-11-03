//https://leetcode.com/problems/find-in-mountain-array/
package com.hasnain;

public class peakInMountain {
    public static void main(String[] args) {

    }
    static int search(int [] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgBs(arr,target,0,peak);
        if (firstTry!= -1){
            return firstTry;
        }
        //else try to search in second half
        //searching from peak + 1 till the end of array i.e arr.length - 1
        else {
            return orderAgBs(arr,target,peak + 1,arr.length - 1);
        }
    }
    static int orderAgBs(int[] arr, int target,int start,int end){
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = (start + end)/2;

            if (arr[mid]==target) return mid;
            if (isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }}
            else{
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else if (target < arr[mid]){
                    start = mid + 1;
                }

            }

        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                // you are in decreasing part of array
                //this may be the ans but look at left
                //this is why end!= mid-1
                end = mid;
            }
            else{
                //you are in ascending part of array
                start = mid + 1; //because we know that mid + 1 is > than mid element

            }
        }
        //in the end we know that start will be equal to end and will be pointing to the same element
        return start; // or end

    }
}

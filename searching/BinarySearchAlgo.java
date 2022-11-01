//Binary search algorithm for an array sorted in ascending order

package com.hasnain;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1,2,6,8,12,22,55};
        System.out.println(binarySearch(arr,12));
    }
    static int binarySearch(int [] arr, int target){
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
        return -1;


    }
}

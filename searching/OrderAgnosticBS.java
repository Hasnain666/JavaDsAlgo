//Check if the array is ascending or descending and according to that, the algorithm changes
package com.hasnain;

public class orderAgnosticBs {
    public static void main(String[] args) {
//        int[] arr = {1,3,5,7,11,15,44,88};
        int [] arr = {77,66,55,44,33,22,11,0};
        int target = 44;
        System.out.println(orderAgBs(arr,target));

    }
    static int orderAgBs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
}

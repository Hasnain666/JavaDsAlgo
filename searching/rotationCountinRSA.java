//find the rotation count in a rotated sorted array
package com.hasnain;

public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

     static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;


    }
    //for non duplicates
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            //4 cases over here
            if ( mid < end && arr[mid] > arr[mid + 1]){
                return mid; //found the answer
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    //for duplicates as well
    static int findPivotDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            //4 cases over here
            if ( mid < end && arr[mid] > arr[mid + 1]){
                return mid; //found the answer
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //if elements at middle,start and end are equal , just skip the duplicates
            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //what if any of these elements were pivots?
                //check if start is pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                //else increment start
                start++;
                //check if end is pivot
                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                //else you can increment
                end--;

            }
            else if(arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

}

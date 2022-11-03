//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
package com.hasnain;

public class infiniteSorted {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int [] arr, int target){
        //finding the range with box size 2
        int start = 0;
        int end = 1;
        //while loop : keep doubling the range till the target element becomes greater than end
        while (target> arr[end]){
            int newStart = end + 1; //obviously the new start will be +1 end
            //double the box value
            // end = previous end + sizeofbox *2
            end = end + (end - start + 1) *2; //if size of box is 4 end - start = 5 - 2 + 1
            start = newStart;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int [] arr, int target,int start, int end){
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

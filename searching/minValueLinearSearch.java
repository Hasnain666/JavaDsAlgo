// find the minimum value in the array
package com.hasnain;

public class minValue {
    public static void main(String[] args) {
        int[] arr = {1,54,99,15,78};
        System.out.println(minValue(arr));

    }
    static int minValue(int [] arr){
        // assuming the first element is the answer
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < ans){
               ans = arr[i];
            }
        }
        return ans;
    }
}

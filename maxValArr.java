// Finding the max value in the array
package com.hasnain;
public class maxValue {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,41,896};
        System.out.println(max(arr));


    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

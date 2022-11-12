//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

class Solution {
    public int missingNumber(int[] nums) {
           int i = 0;
        while(i< nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i]!=nums[correct]){ //only swap if arr < than N & index == element
                swap(nums,i,correct);
            }
            else i++;
        }
        //search for missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return index;
            }
        }
        //case 2
        return nums.length;

    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
        
    }

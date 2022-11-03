class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
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
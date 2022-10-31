// leetcode https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
        
    }
    boolean even (int num){
        int numberofdigits = digits(num);
        return numberofdigits%2==0;
        
        
        
    }
    int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num = num/10;
            
        }
        return count;
        
        
    }
}

// Program to count the number of 3 in num
package com.hasnain;

public class CountNums {
    public static void main(String[] args) {
        int num = 13893683;
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if (rem == 3){
                count++;

            }
            num = num/10;

        }
        System.out.println(count);
    }
}

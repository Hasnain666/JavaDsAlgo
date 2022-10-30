// Program to take a number from the user and print if its a prime number or not
package com.hasnain;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int num, i, count =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        num = sc.nextInt();
        for (i = 2; i <num; i++){
            if (num%i ==0){
                count++;
                break;
            }



        }
        if (count==0){
            System.out.println(num + " is a prime number ");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }



    }
}

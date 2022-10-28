//Java Program to 3 numbers from the user and print the greatest number between them
package com.hasnain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Number 3 : ");
        int num3 = sc.nextInt();
        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        System.out.println("The maximum number is : " + max);


    }
}

//Calculator program in java
package com.hasnain;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number");
        float num2 = sc.nextFloat();
        System.out.println("Enter 1 to add, 2 to subtract, 3 to multiply, 4 to divide ");
        int input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("The addition of " + num1 +  " and " + num2 + " is " + num1 + num2);
                break;

            case 2:
                System.out.println("The subtraction of " + num1 +  " and " + num2 + " is ");
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println("The multiplication of " + num1 +  " and " + num2 + " is " + num1 * num2);
                break;

            case 4:
                System.out.println("The division of " + num1 + " and " + num2 + " is " + num1 / num2);
                break;

        }


    }
}

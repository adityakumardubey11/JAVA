//Q2 - Write a program to print absolute value of a number entered by the user.

import java.util.Scanner;

public class L6conditional_operatorAQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the number");
        num  = sc.nextInt();

        if (num < 0 ) {
            num = num * - 1;
        }
        System.out.println("the absolute number is : " +num);
    }
}

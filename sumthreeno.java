//write a program to sum three number in java.

import java.util.Scanner;

public class sumthreeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num_1 = sc.nextInt();

        System.out.println("Enter your second number");
        int num_2 = sc.nextInt();

        System.out.println("enter your third number");
        int num_3 = sc.nextInt();

        int sum = num_1 + num_2 + num_3;
        System.out.println("sum is :" + sum );
    }
}

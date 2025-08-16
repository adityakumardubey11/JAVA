//Q4 - Write a program to print positive number entered by the user, if user enters a negative number, it is skipped.

import java.util.Scanner;

public class L6conditional_operatorAQ4 {
    public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      int x;
        System.out.println("Enter the number");
        x = sc.nextInt();

        if (x >= 0) {
           System.out.println("you enterd a poitive number");
        }
        else{
           System.out.println("your number is negative and is skipped");
        }
   }
    }
}

// write a program to detect whether a number enterd by user is integer or not.

import java.util.Scanner;

public class integerornot {
    public static void main(String[] args) {

         System.out.println("Enter your number");
         
        Scanner sc = new Scanner(System.in);

        System.out.println(sc.hasNextInt());
    }
}

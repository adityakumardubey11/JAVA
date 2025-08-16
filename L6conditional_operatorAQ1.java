//- Write a program which takes the values of length and breadth from user and check if it is a square or not

import java.util.Scanner;

public class L6conditional_operatorAQ1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the length");
       int length = sc.nextInt();
      
       System.out.println("Enter the breadth");
       int breadth = sc.nextInt();
     
       if (length == breadth) {
        System.out.println("it is Square");
       } else{
        System.out.println("it is not Square");
       }

    }
}
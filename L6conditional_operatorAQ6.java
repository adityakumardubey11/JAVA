//Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :

import java.util.Scanner;

public class L6conditional_operatorAQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.println("Enter the marks");
        marks = sc.nextInt();
         
        if (marks >= 90) {
            System.out.println("your grade is A+");
        } else if (marks >= 80) {
            System.out.println("your grade is A");
        } else if (marks >= 70) {
            System.out.println("your grade is B+");
        } else if (marks >= 60) {
            System.out.println("your grade is B");
        } else if (marks >= 50) {
            System.out.println("your grade is C");
        } else if (marks >= 40) {
            System.out.println("your grade is D");
        } else if (marks >= 30) {
            System.out.println("your grade is E");
        } else if (marks < 30) {
            System.out.println("your grade is F");
        } else {
            System.out.println("Enter valid marks");
        }
    }
}

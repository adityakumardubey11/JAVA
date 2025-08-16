// write a java program to which ask a name from user and greet them with  
//  HELLO "name" have a good day .

import java.util.Scanner;

public class greetingname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = sc.next();

        System.out.println(" HELLO " +  name  +  " Have a Good Day! ");
    }
}
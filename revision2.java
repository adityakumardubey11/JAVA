// take two integers input a and b:a>b, and find the remainder when a is divided by b.

import java.util.Scanner;

public class revision2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first input");
        int a = sc.nextInt();

        System.out.println("second input");
        int b = sc.nextInt();

        int q = a/b;
        int r = a - (b*q);
        System.out.println("the remainder wwhen"+a+"is divided by "+b+"is"+r );
    }
}

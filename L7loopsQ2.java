// sum of first n natural number where n is user input.

import java.util.Scanner;

public class L7loopsQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
       int sum = 0;
       int num = 1;
       while (num <= n) {
        sum = sum + num;
        num++;
       }
       System.out.println(sum);
    }
}
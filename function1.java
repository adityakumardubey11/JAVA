// make a function to add 2 numbers and return the sum.

import java.util.Scanner;

public class function1 {
    public static int CalculateSum(int a, int b){
             int sum = a + b;
             return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
 
        int Sum = CalculateSum(a, b);
        System.out.println(Sum);
    }
}

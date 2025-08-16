//make a function to multiply 2 numbers and return the product.

import java.util.Scanner;

public class function3 {
    public static int CalculateProduct(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println("Product of two nos is : "+ CalculateProduct(a, b));
    }
}

//Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication and division.

import java.util.Scanner;

public class L6conditional_operatorAQ5 {
    public static void main(String[] args) {
        
        char op;
        double num1;
        double num2;
        double ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator : (+,-,*or/)");
        op = sc.next().charAt(0);
        System.out.println("Enter First number");
        num1 = sc.nextDouble();

        System.out.println("Enter second number");
        num2 = sc.nextDouble();

        switch (op) {
            case '+':
                ans = num1 + num2;
                System.out.println(num1 + "+" + num2 + "="+ans);
                break;
            case '-' :
                 ans = num1 - num2;
                 System.out.println(num1 + "-" + num2 + "=" +ans);
                 break;
            case '*' :
                  ans = num1 * num2;
                  System.out.println(num1 + "*" + num2 + "=" + ans);
                  break;
            case '/' :
                  ans = num1 / num2;
                  System.out.println(num1 + "/" + num2 + "=" + ans);
                  break;
            default:
                  System.out.println("ERROR! , operator is not correct");
                break;
        }
    }
}

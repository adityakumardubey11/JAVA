//print the first n factorial number

import java.util.Scanner;

public class L8_problem_q5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int fact = 1;
       for(int i = 1; i <= n ; i++){
         fact = fact * i ;
        System.out.println("factorial of" + i + ":"+fact);
       }
       
    }
}

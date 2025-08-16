//count the number of digit for  given number n.

import java.util.Scanner;

public class L8_problem_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberofdigit = 0;
        int original_n = n;
        while (n>0) {
            n = n / 10;
            numberofdigit++;   //numberofdigit = numberofdigit+1
        }
        System.out.println("number of digits" +original_n + "=" +numberofdigit);
        
    }
}

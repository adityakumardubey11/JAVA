// find the sum of digit in a given number.

import java.util.Scanner;

public class L8_problem_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofdigit = 0;
        int original_n = n;

        while (n>0) {
            sumofdigit += n %10;
            n = n/10;
        }
        System.out.println("sum of digit is"+ original_n + "=" + sumofdigit);
    }
}

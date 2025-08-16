// print the sum of stream of integer in the input.

import java.util.Scanner;

public class L7_loop_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while ( num != -1) {
         sum += num;
         num = sc.nextInt();    
        }
        System.out.println(sum);
    }
}

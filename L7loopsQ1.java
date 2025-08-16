// program to write counting.

import java.util.Scanner;

public class L7loopsQ1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       int num = 1;
       while (num <=n) {
        System.out.println(num);
        num++;
       }
    }
}

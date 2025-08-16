// given two number a and b . find a raise to the power b .

import java.util.Scanner;

public class L8_problem_q6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt() , b = sc.nextInt();
      int ans = 1;
      for(int i = 1; i <= b; i++){
        ans *= a;
      }
      System.out.println(ans);
   } 
}

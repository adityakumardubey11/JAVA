// pattern printing : Rectangular pattern
//                                           ******  
//                                           ******
//                                           ******

import java.util.Scanner;

public class L9_Rectngular_pattern_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
         int c = sc.nextInt();

         for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){

            System.out.print("*");
           }
            System.out.println();      // for new line
         }     
    }
}

// print the pattern                1
//                                 121
//                                12321
//                               1234321
//                              123454321
//                             12345654321

import java.util.Scanner;

public class L9_pattern_print_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i = 1; i<=r; i++){     //traversing over rows

            // print r - i spaces
 
           for(int j = 1; j <= r - i; j++){
 
             System.out.print(" ");
           }
 
         //print 1 to i
 
         for(int k = 1; k <= i; k++){
           System.out.print(k);
         }

         for(int l = i - 1; l >= 1; l--){
              System.out.print(l);
         }
          System.out.println();
       }  
     }
 }

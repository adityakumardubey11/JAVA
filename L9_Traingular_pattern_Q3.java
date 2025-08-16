// triangular pattern    *
//                       **
//                       ***
//                       ****

import java.util.Scanner;

public class L9_Traingular_pattern_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

//   NOTE :-  there is no significance of column in triangular pattern.

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){

                System.out.print("*");
                
            }
             System.out.println();
        }
    }
}

// print this pattern               123456
//                                  123456
//                                  123456
//                                  123456

import java.util.Scanner;

public class L9_numerical_rectangular_pattern_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= 6; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

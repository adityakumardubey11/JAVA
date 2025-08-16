// print the pattern                 1
//                                  2 2
//                                 3   3
//                                4444444

import java.util.Scanner;

public class L9_pattern_print_Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j=i; j <= r - 1; j++){
               System.out.print(" ");
            }
            if(i == 1 || i == r) {
				for (int k = 1 ; k <= (i * 2) - 1; k++ ) 
				{
					System.out.print(k);
				}
			}
			else {
				for (int l = 1; l <= (i * 2) - 1; l++ ) 
				{
					if(l == 1 || l == i * 2 - 1) {
						System.out.print(l);
					}
					else {
						System.out.print(" ");
					}
				}
			}		
			System.out.println();
             
        }
    }
}

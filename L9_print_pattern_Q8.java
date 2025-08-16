// print the pattern                       121212
//                                         212121
//                                         121212
//                                         212121
// you have to give the value of row and column then you ot ans.
import java.util.Scanner;

public class L9_print_pattern_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of row");
        int r = sc.nextInt();
        System.out.println("Enter the number of column");
        int c = sc.nextInt();
        for(int i = 1; i <= r; i++){

            for(int j = 1; j <= c; j++){
               if ((i + j) % 2 == 0) {
                System.out.print(1);
               } else{
                System.out.print(2);
               }
            }
            System.out.println();
        }
    }
}

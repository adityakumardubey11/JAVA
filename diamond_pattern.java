import java.util.Scanner;

public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        

        //   
        for(int i = 1; i <= r; i++){

            for(int j = 1; j <= r-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //
            for(int l = r; l >= 1; l--){

            for(int j = 1 ; j <= r-l; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * l - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


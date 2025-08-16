import java.util.Scanner;

public class alphanumeric_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 5;
        int alpha = 65;
        int num = 0;

        for(int i = 1; i <= r; i++){
            for(int j = r; j > i; j--){
                System.out.print(" ");
            }
              for(int k = 0; k < i * 2 - 1; k++){
                System.out.print((char)(alpha + num ++));
              }
               num = 0;
               System.out.println();
            }
               for(int m = 1; m <= r - 1; m++){ 
                   for(int n = 1; n < m; n++){
                    System.out.print(" ");
                   }
                   for(int k = (r-m)*2; k > 0; k--){
                    System.out.print((char)(alpha + num ++));
                   }
                     num = 0;
                     System.out.println();
               }
        }
    }


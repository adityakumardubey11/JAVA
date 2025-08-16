import java.util.Scanner;

public class if_else_rev {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();

     if (num % 2 == 0) {
        System.out.println("even");
     } else{
        System.out.println("odd");
     }
   } 
}

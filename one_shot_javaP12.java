import java.util.Scanner;

public class one_shot_javaP12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 5 == 0) {
            if (num % 15 != 0) {
              
            }
           System.out.println("the number is divisible by 3 and 5 but not 15");
           } 
           else{
            System.out.println("not matching the requoired condition");
           }
    
    }
}

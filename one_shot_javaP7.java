//divisible by 3 and 5

import java.util.Scanner;

public class one_shot_javaP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // if (num % 3 == 0 && num % 5 == 0) {
        //     System.out.println("answer" +num);
        // }

        // divisible by 5 but not divisible by 3
        //  if (num % 3 != 0 && num % 5 == 0) {
        //    System.out.println("answer" +num);
       // }

        // divisible by 5 or 3
         if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("answer" +num);
        }
    }
}

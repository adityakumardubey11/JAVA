// given number is three digit or not

import java.util.Scanner;

public class one_shot_javaP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take the digit number");
        int num = sc.nextInt();

        if(num>99 && num<1000) {
            System.out.println("yes, its three digit number");
        } else{
            System.out.println("No, it is not a three digit number");
        }


        // counting two digit number.
         if(num>9 && num<100) {
            System.out.println("yes, its two digit number");
        } else{
            System.out.println("No, it is not a two digit number");
        }
    }
}

import java.util.Scanner;

public class one_shot_javaP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        if (num < 0) {
           num = num * (-1) ;
        }
        System.out.println("the absolute number is " +num);
    }
}

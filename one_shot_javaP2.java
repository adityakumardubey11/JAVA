import java.util.Scanner;

public class one_shot_javaP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Divsible");
        } else{
            System.out.println("Not Divisible");
        }
    }
}

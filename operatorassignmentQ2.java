import java.util.Scanner;

public class operatorassignmentQ2 {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);

        System.out.println("Enter first number");
        int x = scn.nextInt();

        System.out.println("Enter the second number");
        int y = scn.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);
    }
}

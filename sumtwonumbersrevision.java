import java.util.Scanner;

public class sumtwonumbersrevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num_1  = sc.nextInt();
        
        System.out.println("Enter your second number");
        int num_2 = sc.nextInt();
    
        int sum = num_1 +num_2;
        System.out.println("sum is" + sum);
    }
}

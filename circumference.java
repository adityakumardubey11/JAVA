import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // double r = sc.nextInt();
        // double pi = 3.14;
        // double circumference = 2 * pi * r;
        // System.out.println(circumference);

        int age  = sc.nextInt();

        if(age > 18){
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }
    }
}

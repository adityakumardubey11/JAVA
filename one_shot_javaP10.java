import java.util.Scanner;

public class one_shot_javaP10 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        System.out.println("enter 3rd number");
        int c = sc.nextInt();

        if (a+b>c && b+c>a && a+c>b){
            System.out.println("these numbers can be the sides of the traingle");
        }else{
            System.out.println("invalid triangle");
        }
    }
}

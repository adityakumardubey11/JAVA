import java.util.Scanner;

public class greater_of_2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int p = sc.nextInt();
        System.out.println("enter 2nd number");
        int q = sc.nextInt();

        if(p > q){
            System.out.println("the greater no is " +p);
        }
        else{
            System.out.println(q);
        }
    }
}
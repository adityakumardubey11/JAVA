import java.util.Scanner;

public class fibonacci {

        static void fibonacci(int N){
        int num1 = 0; int num2 = 1;
         
        for(int i = 1; i <= N; i++){
            System.out.println(num1 +" ");
        
        int num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        fibonacci(N);
    } 
}

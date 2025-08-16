import java.util.Scanner;

public class Function_pQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.print(avg(A,B,C));
    }
    public static int avg(int A, int B, int C){
        return (A + B + C) / 3;
}
}

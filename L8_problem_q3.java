import java.util.Scanner;

public class L8_problem_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
       

        while (n>0) {
           ans =  ans*10 + n % 10;
            n/=10;
        }
        System.out.println(ans);
    }
}

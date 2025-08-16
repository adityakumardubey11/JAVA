import java.util.Scanner;

public class gfg_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if(n == m){
            System.out.println("Equal");
        } else if(n > m){
            System.out.println("Greater");
        } else {
            System.out.println("lesser");
        }
    }
}


// smallest of three number.


import java.util.Scanner;

public class small_3_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(smallest(a,b,c));
    }
    public static int smallest(int a , int b, int c){
        return Math.min(a, Math.min (b,c));
    }
}

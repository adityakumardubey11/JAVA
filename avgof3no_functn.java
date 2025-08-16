// avg of three number

import java.util.Scanner;

public class avgof3no_functn {
    public static int Avg(int a, int b, int c){
         return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("avg is : "+ Avg(a, b, c));
    }
}


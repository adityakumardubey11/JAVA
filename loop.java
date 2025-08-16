import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
    //    int sum = 0;
    //    int num = 1;

    //    while (num <= n) {
    //     System.out.println(num);
    //     sum = sum + num;
    //     num = num + 1;
    //    }
    //    System.out.println(sum);
     
    // for(int num = 1; num <= n; num++){
    //     System.out.println(num);
    // }

    for(int num = n;  num >= 1; num --){
      System.out.println(num);
    }
    }
}

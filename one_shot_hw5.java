import java.util.Scanner;

public class one_shot_hw5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age of ram");
        int a = sc.nextInt();
        System.out.println("Enter the age of shyam");
        int b = sc.nextInt();
        System.out.println("Enter the age of ajay");
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println(a+" ram is youngest" );
        } if (b>a && b>c) {
            System.out.println(b+" shyam is youngest");
        } if (c>a && c>b) {
            System.out.println(c+" ajay is youngest");
        }
    }
  }  

     
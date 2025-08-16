import java.util.Scanner;

public class one_shot_javaP13 {
  public static void main(String[] args) {
   Scanner sc  = new Scanner(System.in);
   System.out.println("enter the  1st number");
   int a = sc.nextInt();
   System.out.println("enter 2nd number");
   int b = sc.nextInt();
   System.out.println("Enter third number");
   int c = sc.nextInt();
   if (a>b && a>c ) {
     System.out.println(a+"largest number");
   } else if (b>c && b>a) {
      System.out.println("largest is"+b);
   }  else { 
    System.out.println("largest" +c);

   }
    
   }
  }  


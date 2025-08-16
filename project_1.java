

import java.util.Scanner;

public class project_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the password");
        int password = sc.nextInt();


        //  int a = 1234;
        //  int b = 1234;
        // if (a == b) {
        //    System.out.println("gate is open"); 
        // } else 
        //     System.out.println("gate is not open please try once more");

         switch (password) {
            case 1234:
                System.out.println("gate is open - *aayiye aapka swagat hai*");
                
                  System.out.println("Enter your name");
                  String name = sc.next();

                  System.out.println(" HELLO " +  name  +  " Have a Good Day! ");
                break;
                 

         
         
            default:
                System.out.println("gate will not open - *jldi  niklo yha se... nikal...*");
                break;
         }

        //  System.out.println("Enter your name");

        // String name = sc.next();

        // System.out.println(" HELLO " +  name  +  " Have a Good Day! ");
        }
    }


//Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit

import java.util.Scanner;

public class L6conditional_operatorAQ3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cp;
            int sp;

            System.out.println("Enter the Cost price");
      cp = sc.nextInt();
             
            System.out.println("Enter the Selling Price");
      sp = sc.nextInt();
            int amt;

            if (cp>sp) {
                amt = cp - sp;
                System.out.println("the loss is:"+amt);
            }
            else if(cp<sp){
                amt = sp - cp;
            System.out.println("the profit is:"+amt);
            } else{
                System.out.println("no profit no loss");
            }
        }
    }
}   


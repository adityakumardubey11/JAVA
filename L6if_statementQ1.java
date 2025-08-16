import java.util.Scanner;

public class L6if_statementQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         

        // by using if else statement
        if (num % 2 == 0) {
           System.out.println("even"); 
        }
        else{
            System.out.println("odd");
        }
         
        // OR
        
        // by using ternary operator
        String ans;
        ans =  (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);
    }
}

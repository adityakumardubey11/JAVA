import java.util.Scanner;

public class problemloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumOfdigits = 0;
        int original_n = n;

        while (n > 0) {
          sumOfdigits += n % 10;
          n = n / 10;          
        }
        System.out.println("Number of digit in" +n+ "=" + sumOfdigits);
    

    }
}

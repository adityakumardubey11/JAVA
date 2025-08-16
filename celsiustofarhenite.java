import java.util.Scanner;

public class celsiustofarhenite {
    public static void main(String[] args) {
        double celsius,fahrenhite;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter temp in celsius"); 
            celsius = sc.nextFloat();
        }
        fahrenhite =( celsius  * ( 9.0 / 5.0)) + 32;

        System.out.println("temprature in fahrenhite" + fahrenhite);
        }
    }

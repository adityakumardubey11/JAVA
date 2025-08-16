//write a java program to convert kilometer to miles

import java.util.Scanner;

public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter kilometer distannce");
        float km = sc.nextFloat();

        float miles = (float)(0.6213711922 * km);

        System.out.println("distance in miles is :" +miles);
          
    }
}

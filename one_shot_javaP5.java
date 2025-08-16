import java.util.Scanner;

public class one_shot_javaP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        int area;
        int perimeter;
        area = length * breadth;
        perimeter = 2 * (length + breadth);

        if (area > perimeter) {
            System.out.println("area is greater than perimeter");
        } else{
            System.out.println("perimeter is greater than area");
        }
    }
}

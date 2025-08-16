
import java.util.Arrays;
class ArraysExample{
 public static void demoarray(){
     int[] age = new int[3];
     float[] weight = new float[3];
     String[] names = new String[3];
     
     age[0] = 34;
     age[1] = 12;
     age[2] = 45;


     System.out.println(age[0]);
     System.out.println(age[1]);
     System.out.println(age[2]);
   }
}
public class Array_1 {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoarray();
    }
}

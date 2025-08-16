import java.util.Scanner;

public class arrayQ2 {
    //Count the number of element stricly greater than the value of x

    static int strictlyGreater(int[] arr, int x){
        int count = 0; 
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > x){
                    count++;
                }
            }
            return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + "element");
         for(int i = 0; i < arr.length; i++){
            arr [i] = sc.nextInt();
         }

         System.out.println("enter x");
         int x = sc.nextInt();

         System.out.println("the number of stricly greater than the value of : " + strictlyGreater(arr, x));

    }
}

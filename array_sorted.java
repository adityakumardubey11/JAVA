import java.util.Scanner;

public class array_sorted {
    // check the given array is sorted or not 
    static boolean isSorted(int[] arr){
          boolean check = true;

          for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                // not sorted 
                check = false;
                break;
            }
          }
          return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
           System.out.println("Enter the size of array");
           int n = sc.nextInt();

           int [] arr = new int[n];
           System.out.println("enter : " + n + "element");
           for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
           }
           System.out.println(" is Sorted : "  +  isSorted(arr));

    }
}

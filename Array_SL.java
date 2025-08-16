// find largest and smallest value in array 
// at kth element also

import java.util.Arrays;
import java.util.Scanner;

public class Array_SL {
    // find Smalst and largest in array.
    static int[] smallestAndLargest(int[] arr){
       Arrays.sort(arr);
       int [] ans = {arr[0], arr[arr.length-1]};
        return ans;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter " + n + "element");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // System.out.println("enter x");
        // int x = sc.nextInt();
        int[] ans = smallestAndLargest(arr);
        System.out.println("smallest:" + ans[0]);
        System.out.println("largest:" + ans[1]);
    }
}

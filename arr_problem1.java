// Given an unsorted array arr[] of size N having both negative and positive integers, place
// all negative elements at the end of array without changing the order of positive elements
// and negative elements.

import java.util.Scanner;

public class arr_problem1 {
    
    static int consizetheArray(int arr[], int n);
    int [] ans = new int[k];
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                ans[idx] = arr[i];
                idx++;
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(ans[i] + " ");
        }
   public static void main(String[] args) {
    
   } {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of element");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for(int i = 0; i <= n; i++){
            arr[i] = sc.nextInt();
        }

      System.out.println(consizetheArray(arr, n));
    }
}

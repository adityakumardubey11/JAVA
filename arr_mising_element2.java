import java.util.Scanner;

public class arr_mising_element2 {
    public int missingNumber(int[] nums) {
        int ans =0;
         for(int i=0;i<=nums.length;i++){    //n=nums.length
             ans = ans ^ i;
         }
         for(int i=0;i<nums.length;i++){
             ans = ans ^ nums[i];
         }
         return ans; 
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt(); 

        int [] arr = new int[n];
        System.out.println("Enter " + n + " element");
        
    }
   
 }


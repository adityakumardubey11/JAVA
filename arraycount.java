import java.util.Scanner;

public class arraycount {
    
// find last occurance of element x.

    static int lastOccurance(int [] arr, int x ){
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
     // print a program to count number of x

    // static int countOccurances(int[] arr, int x){
    //         int count = 0; 
    //         for(int i = 0; i < arr.length; i++){
    //             if(arr[i] == x){
    //                 count++;
    //             }
    //         }
    //         return count;
    // }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
          
        int[] arr = new int[n];
        System.out.println("Enter" + n + "element");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();

    //    System.out.println("count x : "  +  countOccurances(arr, x));
        System.out.println("last occurance of x : "  +  lastOccurance(arr, x));
    }
}

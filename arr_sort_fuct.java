import java.util.Arrays;
import java.util.Scanner;

public class arr_sort_fuct {
    static void sortArray(int [] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " element");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
    }
}

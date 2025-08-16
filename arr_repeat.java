import java.util.Scanner;

public class arr_repeat {
    static int firstRepatedElement(int [] arr, int n, int k){
        for(int i = 0; i < n; i++){

            int count = 0; 
            for(int j = 0; j < n; j++){
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == k){
                return arr[i];
            }
        }
        return -1;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size of array");
            int n = sc.nextInt();
    
            int [] arr = new int[n];
    
            System.out.println("Enter " + n + " Element");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("FIrst repeating number : " + firstRepatedElement(arr, n, n));
}
}


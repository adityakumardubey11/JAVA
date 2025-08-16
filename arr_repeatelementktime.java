import java.util.Scanner;

public class arr_repeatelementktime {

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
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < arr.length; i ++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(k);

        System.out.println(firstRepatedElement(arr, n, k));
    }
}

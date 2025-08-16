import java.util.Scanner;

public class arr_diffOfeleisX {
    static boolean diffOfelement(int[] arr, int x){
              boolean check = false;
        for(int i = 1; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                if(arr[j] - arr[i] == x){
                  check = true;
                }
            }
        }
       return check;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
          int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter" + n + "element");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x");
        int x = sc.nextInt();

        System.out.println("is " + diffOfelement(arr, x));
    }
}

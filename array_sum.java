// sum of given array

class ArraysExample{
    void maxNumber(){
        int[] arr = {8,9,55,66};

    //     int ans = 0;
    //   for(int i = 0; i < arr.length; i++ ){
    //     if(arr[i] > ans ){
    //         ans = arr[i];
    //     }
    //   }
    //   System.out.println("Max " + ans);
      
        int x = 55;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
            } 
            
        }
        System.out.println(" found "  +  x  + " at index " + ans);
    }
    // void sumOfArray(){
    //    int[] arr = {1,4,6,5} ;
    //    int sum = 0;

    //    for(int i = 0; i < arr.length; i++){
    //     sum = sum + arr[i];
    //    }
    //    System.out.println(sum);
    //}
}

public class array_sum {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        // obj.sumOfArray();
        obj.maxNumber();
    }
}

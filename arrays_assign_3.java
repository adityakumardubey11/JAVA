public class arrays_assign_3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        for(int x : arr){
            if(x % 2 == 0){
                System.out.println(x);
            }
        }
    }
}

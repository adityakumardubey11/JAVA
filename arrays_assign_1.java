class test{
    void findpositiveno(){
        int[] arr = {2, 6, -5, 0, 4, -9};
        for(int val : arr){
            if(val >= 0){
                System.out.println(val);
            }
        }
    }

}

public class arrays_assign_1 {
    public static void main(String[] args) {
        test obj = new test();
        obj.findpositiveno();
    }
}

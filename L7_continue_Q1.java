public class L7_continue_Q1 {
    public static void main(String[] args) {
        
    //  for(int num = 1; num <= 5; num++){
    //     if (num % 3 == 0) {
    //         continue;
    //     }
    //     System.out.println(num);
    //  }

    int num = 1;
    while(num <= 50){
        if (num % 3 == 0) {
           num++; continue;
        }
        System.out.println(num);
        num++;
    }
  }

}
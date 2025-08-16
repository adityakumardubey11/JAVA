// 0-1 taingle

public class AC_pattern_print_9 {
    public static void main(String[] args) {
        int r = 5;

        for(int i = 1; i <= r; i++){
            for (int j = 1; j <= i; j++){
                int sum = i + j;
                if (sum % 2 == 0) {  
                        System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            
            System.out.println();
        }
    }
}

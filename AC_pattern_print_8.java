// Floyd's triangle pattern


public class AC_pattern_print_8 {
    public static void main(String[] args) {
        int r = 5;
        int number = 1;

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}

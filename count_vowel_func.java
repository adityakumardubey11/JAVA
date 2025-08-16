import java.util.Scanner;

public class count_vowel_func {
    public static int count(String S){
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(count(s));
    }
}

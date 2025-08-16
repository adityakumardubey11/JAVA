// import java.util.Scanner;

// public static String middle(String s) {
//     if(s.length() % 2 == 0){
//        return s.substring(s.length()/2, s.length()/2+2);
//     } else {
//         return s.substring(s.length()/2,s.length()/2+1);
//     }
// }
// public class func_disp_mid_charac {
//     public static void main(String[] args) {
        
    
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter String :");
//     String S = sc.nextLine();
//     System.out.print(middle(S));
// }
// }
import java.util.Scanner;
public class func_disp_mid_charac {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String :");
            String S = sc.nextLine();
            System.out.print(middle(S));
        }
        public static String middle(String s){
            if(s.length() % 2 == 0){
            return s.substring(s.length()/2, s.length()/2 + 2);
            }else{
            return s.substring(s.length()/2, s.length()/2 + 1);
    }  
}
} 

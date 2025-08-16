import java.util.Scanner;

public class one_shot_javaP4 {
    public static void main(String[] args) {
        int cp;
        int sp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price");
        cp = sc.nextInt();
        System.out.println("Enter selling Price");
        sp = sc.nextInt();
        int amt;


        if (cp>sp) {
            System.out.println("you are in loss");
            amt = cp - sp;
            System.out.println("the loss is:"+amt);
        } else if(cp<sp){
            System.out.println("you are in profit");
            amt = sp - cp;
            System.out.println("the profit is:" + amt);
        } else{
            System.out.println("no profit no loss");
        }
    }
}

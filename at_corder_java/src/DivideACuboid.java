import java.util.Scanner;

public class DivideACuboid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 問題条件から、long型でないと、不具合が起こると予測できる。
        long a = Long.parseLong(sc.next()),
             b = Long.parseLong(sc.next()),
             c = Long.parseLong(sc.next());
        sc.close();

        if(a%2==0 || b%2==0 || c%2==0){
            System.out.println(0);
        } else {
            long ans = Math.min(a*b, Math.min(a*c, b*c));
            System.out.println(ans);
        }

    }
}
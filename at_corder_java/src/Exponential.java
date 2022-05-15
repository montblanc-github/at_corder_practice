import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next()),
            ans = 0;
        sc.close();

        if(x==1){
            System.out.println(1);
            System.exit(0);
        }

        for(int i=2; i<=x; i++){
            int num = i*i;
            while(num<=x){
                ans = Math.max(ans, num);
                num *= i;
            }
        }

        System.out.println(ans);
    }
}
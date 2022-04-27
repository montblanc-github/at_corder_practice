import java.util.Scanner;

public class SomeSums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()), a = Integer.parseInt(sc.next()), b = Integer.parseInt(sc.next()), ans = 0;
        sc.close();

        for(int i = 1; i <= n; i++){
            int sum = 0, d = i;
            for(int j = 0; j < 5; j++){
                sum += d % 10;
                d /= 10;
            }
            if( a <= sum && sum <= b)ans += i;
        }

        System.out.println(ans);
    }
}
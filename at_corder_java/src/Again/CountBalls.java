package Again;

import java.util.Scanner;

public class CountBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next()),
            a = Long.parseLong(sc.next()),
            b = Long.parseLong(sc.next());
        sc.close();

        long ans = (n / (a + b)) * a;
        long rem = n % (a + b);

        ans += Math.min(rem, a);

        System.out.println(ans);
    }
}

// 問題文通り、かつ、総数を割った回数分の個数+割り切れない数分の青いボール分の個数が回答。
// 苦戦した点：特になし。
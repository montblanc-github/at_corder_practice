package Again;

import java.util.Scanner;

public class ReplacingInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next()),
             k = Long.parseLong(sc.next());

        sc.close();

        long num = n % k;

        long ans = Math.min(num, k - num);

        System.out.println(ans);
    }
}

// nをkで割った余りだけ差分が生じるため、最小値は余りもしくは、kから余りを引いた差分のどちらかになる。
// 苦戦した点：余りの距離分、数値が変化することには気づけたが、その先、どのように計算を実現するかに気づけなかった。
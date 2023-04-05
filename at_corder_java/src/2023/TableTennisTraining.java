import java.util.Scanner;

public class TableTennisTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next()),
             a = Long.parseLong(sc.next()),
             b = Long.parseLong(sc.next()),
             ans = 0;
        sc.close();

        boolean aToEven = a % 2 == 0,
                bToEven = b % 2 == 0;
        long min;

        if ((aToEven && bToEven) || (!aToEven && !bToEven)) {
            ans = (b - a) / 2;
        } else {
            min = Math.min((a - 1), (n - b));
            ans = min + 1 + (b - a - 1) / 2;
        }

        System.out.println(ans);
    }
}

// お互いの距離は一定。そのため、距離が偶数の場合は、同じ卓、奇数の場合は、末端の卓になる。
// 苦戦した点：距離が奇数の場合の計算式。
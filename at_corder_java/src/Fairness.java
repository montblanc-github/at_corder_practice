import java.util.Scanner;

public class Fairness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next()),
             b = Long.parseLong(sc.next()),
             c = Long.parseLong(sc.next()),
             k = Long.parseLong(sc.next()),
             ans = 0L;
        sc.close();

        if (k%2 == 0) {
            ans = a - b;
        } else {
            ans = b - a;
        }

        if (Math.pow(10, 18) < Math.abs(ans)) {
            System.out.println("Unfair");
        } else {
            System.out.println(ans);
        }
    }
}

// 規則がある。回数が偶数の場合は、a-bとなる。→＜結果＞正解。
// 苦戦した点：powとabsを使用する点。。
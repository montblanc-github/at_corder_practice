import java.util.Scanner;

public class CookieExchanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next()),
            c = Integer.parseInt(sc.next());
        sc.close();

        if (a == b && b == c) {
            System.out.println(-1);
            System.exit(0);
        }

        int ans = 0;
        int x,y,z;

        while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            x = a;
            y = b;
            z = c;
            a = (y + z) / 2;
            b = (x + z) / 2;
            c = (x + y) / 2;
            ans++;
        }

        System.out.println(ans);
    }
}

// 問いの通り、コーディング→他2人の合計数の半分を代入→一つでも奇数が出た場合、繰り返し解除→＜結果＞正解。
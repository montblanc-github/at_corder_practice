package Again;
import java.util.Scanner;

public class CookieExchanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next()),
            b = Long.parseLong(sc.next()),
            c = Long.parseLong(sc.next());
        sc.close();

        if (isEnd(a, b, c)) {
            System.out.println(0);
            System.exit(0);
        }

        if (a == b && b == c) {
            System.out.println(-1);
            System.exit(0);
        }

        long ans = 0L;
        long x,y,z;

        do {
            x = (b + c) / 2;
            y = (a + c) / 2;
            z = (a + c) / 2;
            ans++;
            a = x;
            b = y;
            c = z;
        } while (!isEnd(a, b, c));

        System.out.println(ans);
    }

    static boolean isEnd(long a, long b, long c) {
		if ( a%2 == 1 ) { return true; }
		if ( b%2 == 1 ) { return true; }
		if ( c%2 == 1 ) { return true; }
		return false;
	}
}

// 問いの通り、コーディング→他2人の合計数の半分を代入→一つでも奇数が出た場合、繰り返し解除→＜結果＞正解。一問不正解。ロングにする必要。奇数が含まれている場合の分岐を追加。
// 苦戦した点：ロング型の場合の初期化にLが必要な点。共通化。代入箇所。
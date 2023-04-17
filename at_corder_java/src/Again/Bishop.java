package Again;

import java.util.Scanner;

public class Bishop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next()),
             m = Long.parseLong(sc.next()),
             ans = h * m;
        sc.close();

        if (h == 1 || m == 1) {
            System.out.println(1);
        } else {
            if (ans % 2 == 0) {
                System.out.println(ans / 2);
            } else {
                System.out.println(ans / 2 + 1);
            }
        }

    }
}

// マス目合計の半分が答え。奇数の場合は、半分＋1となる。
// 苦戦した点：片方が1となるケースは注意しなくてはならない点。また、繰り上げ等の計算過程による誤差に注意しなくてはならない。
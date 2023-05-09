package Again;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next()),
            c = Integer.parseInt(sc.next()),
            x = Integer.parseInt(sc.next());
        sc.close();

        int count = 0;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    int num = 500 * i + 100 * j + 50 * k;
                    if (num == x) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

// 設問通りの全通りを調べればよい。
// 苦戦した点：特になし。
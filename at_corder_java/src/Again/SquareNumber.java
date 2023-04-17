package Again;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer buf = new StringBuffer();
        buf.append(sc.next());
        buf.append(sc.next());
        String str = buf.toString();
        sc.close();

        int number = Integer.parseInt(str);

        for (int i = 1; i < 1000; i++) {
            if (number == (i * i)) {
                System.out.println("Yes");
                System.exit(0);
            }
        }

        System.out.println("No");

    }
}

// 設問通りに実行、かつ、考え得る最大値の数値の2乗数と比較を行う。
// 苦戦した点：最大値の平方根を求めるコードを、問題文の最大値とするか、与えられる入力例の最大値とするか、実行時間とメモリにかなりの差異が生じる。

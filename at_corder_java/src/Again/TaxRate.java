package Again;

import java.util.Scanner;

public class TaxRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.next());
        double tax = 1.08;
        sc.close();

        double x = Math.ceil(n / tax);

        if (Math.floor(x * tax) == n) {
            System.out.println((int)x);
        } else {
            System.out.println(":(");
        }
    }
}

// 設問通りの回答で問題なし。
// 苦戦した点：intやdoubleの計算上の型変換状態。周辺値でどのように算出して、最終確認をおこなうかの手段。
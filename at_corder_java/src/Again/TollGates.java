package Again;

import java.util.Scanner;

public class TollGates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            m = Integer.parseInt(sc.next()),
            x = Integer.parseInt(sc.next()),
            down = 0,
            up = 0;

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(sc.next());
            if (num < x && num > 0) {
                down++;
            } else if (num < n && num > x) {
                up++;
            }
        }

        sc.close();

        System.out.println(Math.min(down, up));
    }
}

// xより小さい値のゲートの合計値と大きい値のゲートの合計値を比較して、少ない方が回答。
// 苦戦した点：AND条件とOR条件の箇所で最初OR条件を選び、誤った分岐となっていた点。

package Again;

import java.util.Scanner;

public class CollectingBallsEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            k = Integer.parseInt(sc.next()),
            ans = 0,
            x = 0;
        
        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(sc.next());
            ans += Math.min(x, (k - x));
        }

        sc.close();

        System.out.println(2 * ans);
    }
}

// 同じ線上に存在するロボットの最短移動距離をそれぞれ求める問題。
// 苦戦した点：問題文の理解。座標軸の理解をするのが困難であった。
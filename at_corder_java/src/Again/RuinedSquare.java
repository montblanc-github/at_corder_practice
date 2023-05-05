package Again;

import java.util.Scanner;

public class RuinedSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next()),
            c = Integer.parseInt(sc.next()),
            d = Integer.parseInt(sc.next());
        sc.close();

        int u = (b - d) + c,
            x = (c - a) + d,
            y = u - (c - a),
            z = (b - d) + x;

        System.out.println(u + " " + x + " " + y + " " + z);
    }
}

// 回転行列の理解が必要となる。
// 苦戦した点：それぞれの差分をどの値に考慮して、計算するか。
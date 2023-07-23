package Again;

import java.util.Scanner;

public class HalfAndHalf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int A = Integer.parseInt(sc.next()),
                  B = Integer.parseInt(sc.next()),
                  C = Integer.parseInt(sc.next()),
                  X = Integer.parseInt(sc.next()),
                  Y = Integer.parseInt(sc.next());
        sc.close();

        int ans = (A * X) + (B * Y);

        int halfCnt1 = 0,
            halfCnt2 = 0,
            halfCnt3 = 0,
            halfCnt4 = 0;

        int diff = Math.abs(X - Y);

        if (X > Y) {
            halfCnt1 = (C * X * 2);
            halfCnt2 = (C * Y * 2) + (A * diff);
            ans = Math.min(ans, Math.min(halfCnt1, halfCnt2));
        } else if (X == Y) {
            ans = Math.min(ans, (C * X * 2));
        } else {
            halfCnt3 = (C * X * 2) + (B * diff);
            halfCnt4 = (C * Y * 2);
            ans = Math.min(ans, Math.min(halfCnt3, halfCnt4));
        }
        
        System.out.println(ans);
    }
}
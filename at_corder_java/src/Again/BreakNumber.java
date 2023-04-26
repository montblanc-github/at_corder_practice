package Again;

import java.util.Scanner;

public class BreakNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
        ans = 0;
        sc.close();

        int[] arr = {2,4,8,16,32,64};

        if (n == 1) {
            ans = 1;
        } else {
            for (int i : arr) {
                if (i <= n) {
                    ans = i;
                } else {
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}

// 2の乗数が最も多い数となるため、100までの2の乗数を配列にもたせ、その中から最大値を取ればよい。
// 苦戦した点：特になし。
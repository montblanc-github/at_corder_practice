package Again;
import java.util.Scanner;

public class RangeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next()),
             b = Long.parseLong(sc.next());
        sc.close();

        if (a > 0 && b >= 0) {
            System.out.println("Positive");
            return;
        }

        if (a <= 0 && b >= 0) {
            System.out.println("Zero");
            return;
        }

        if ((b - a) % 2 == 1) {
            System.out.println("Positive");
          } else {
            System.out.println("Negative");
          }

        // for (long i = a; i < b+1; i++) {
        //     if (i == 0) {
        //         System.out.println("Zero");
        //         return;
        //     }
        //     ans *= i;
        // }

        // if (ans < 0) {
        //     System.out.println("Negative");
        // } else  {
        //     System.out.println("Positive");
        // }
    }
}

// for文の中で0を省く、かつ、問題文通りに計算→＜結果＞1問不正解。
// bからaを引いた場合、奇数だった場合、Positiveを出力する。計算しない形。→＜結果＞正解。
// 苦戦した点：問題文通りに計算せず、規則を見つけ出し最短距離を取る点。

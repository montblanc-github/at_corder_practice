import java.util.Scanner;

public class DividingAStringAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();

        String a = "",
               b = "";

        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            b += S.charAt(i);
            if (!a.equals(b)) {
                a = b;
                b = "";
                count++;
            }
        }

        System.out.println(count);
    }
}

// 問題文通りの解法で解こうとしたが、うまく分割できず、タイムアップ。
// 苦戦した点：DP法や漸化式が分からない。どういった解法なのか図形イメージが持てなかった。
// 解決すべき課題：DP法の解釈を理解すること。
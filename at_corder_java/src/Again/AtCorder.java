package Again;

import java.util.Scanner;

public class AtCorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        sc.close();

        int max = 0,
            ans = 0;

        // 下記だと、最後の文字が対象の場合に、正しくカウントできない。
        // for (String text : str) {
        //     if (text.equals("A") || text.equals("C") || text.equals("G") || text.equals("T")) {
        //         max++;
        //     } else {
        //         if (max > ans) {
        //             ans = max;
        //         }
        //     }
        // }


        for (String text : str) {
            if (text.equals("A") || text.equals("C") || text.equals("G") || text.equals("T")) {
                max++;
            } else {
                max = 0;
            }
            if (max > ans) {
                ans = max;
            }
        }

        System.out.println(ans);

    }
}

// ACGT文字列が含まれている場合のみ、maxを加算しつづける。
// 苦戦した点：最後の文字列も条件に当てはまる場合、上記のコメントアウトのコードだと、0になるため、その対応が必要な点。
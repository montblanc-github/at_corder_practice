package Again;

import java.util.Scanner;

public class ColoringColorfully {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");

        sc.close();
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < str.length; i++) {
            if ((i%2 == 0 && str[i].equals("1")) || (i%2 == 1 && str[i].equals("0"))) {
                countA++;
            } else {
                countB++;
            }
        }

        System.out.println(Math.min(countA, countB));
    }
}

// 101010...と010101...の両方と比較してどちらが最小値となるか求める。
// 苦戦した点：特になし。
// 改善点：実行時間。
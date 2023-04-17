package Again;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[3][3];
        boolean[][] flags = new boolean[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (boolean[] flag : flags) {
            Arrays.fill(flag, false);
        }

        int n = Integer.parseInt(sc.next());
        int[] bingo_numbers = new int[n];

        for (int i = 0; i < bingo_numbers.length; i++) {
            bingo_numbers[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int num : bingo_numbers) {
                    if (numbers[i][j] == num) {
                        flags[i][j] = true;
                    }
                }
            }
        }

        String ans = "No";

        for (int i = 0; i < 3; i++) {
            if (flags[i][0] && flags[i][1] && flags[i][2]) {
                ans = "Yes";
            } else if (flags[0][i] && flags[1][i] && flags[2][i]) {
                ans = "Yes";
            }
        }

        if(flags[0][0] && flags[1][1] && flags[2][2]) ans = "Yes";
        if(flags[0][2] && flags[1][1] && flags[2][0]) ans = "Yes";

        System.out.println(ans);
    }
}

// 一致する値があった場合のbooleanの配列を用意する。→斜めと一列が一致する際にビンゴとなるように文字列を設定する。
// 苦戦した点：配列を複数用意するため、配列のループをどう用意するのが効率的か考える点。
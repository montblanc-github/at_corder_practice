package Again;

import java.util.Scanner;

public class SevenFiveFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        sc.close();

        int min = 1000;
        
        for (int i = 0; i < str.length - 2; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str[i]);
            sb.append(str[i + 1]);
            sb.append(str[i + 2]);
            int num = Integer.parseInt(sb.toString());
            min = Math.min(min, Math.abs(753 - num));
        }

        System.out.println(min);
    }
}

// 問題文通り、連続する3桁の最小の差を求めて出力すれば良い。
// 苦戦した点：特になし。

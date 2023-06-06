package Again;

import java.util.Scanner;

public class AToZString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int ans = str.lastIndexOf("Z")- str.indexOf("A") + 1;

        System.out.println(ans);
    }
}

// 先頭から検索と最後尾から検索を組み合わせる。
// 苦戦した点：特になし。
package Again;

import java.util.Scanner;

public class Thin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high = Integer.parseInt(sc.next()),
            width = Integer.parseInt(sc.next());

        for (int i = 0; i < high; i++) {
            String text = sc.next();
            System.out.println(text);
            System.out.println(text);
        }

        sc.close();
    }
}

// 問題文通り。
// 苦戦した点：なし。
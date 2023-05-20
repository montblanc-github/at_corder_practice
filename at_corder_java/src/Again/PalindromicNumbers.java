package Again;

import java.util.Scanner;

public class PalindromicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next());
        sc.close();

        int ans = 0;

        for (int i = a; i <= b; i++) {
            if (isPalindromic(i)) {
                ans++;
            }
        }

        System.out.println(ans);
    }

    private static boolean isPalindromic(int num){
        int first = num / 10000;
        int second = (num / 1000) % 10;
        int four = (num / 10) % 10;
        int last = num % 10;

        if ((first == last) && (second == four)) {
            return true;
        } else {
            return false;
        }
    }
}

// 5桁の数値であるため、上から2桁と下から2桁が同じであれば回文といえる。
// 苦戦した点：特になし。
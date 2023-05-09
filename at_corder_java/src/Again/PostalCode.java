package Again;

import java.util.Scanner;

public class PostalCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next());
        char[] str = sc.next().toCharArray();
        sc.close();

        // int count = 0;
        // String ans = "Yes";

        // for (String text : str) {
        //     count++;
        //     if ((a+1) == count) {
        //         if (!text.equals("-")) {
        //             ans = "No";
        //             break;
        //         }
        //     } else if ((a >= count) || (b >= count && a <= count)) {
        //         try {
        //             int num = Integer.parseInt(text);
        //             if (!(num >= 0 && num <= 9)) {
        //                 ans = "No";
        //                 break;
        //             }
        //         } catch (NumberFormatException e) {
        //             ans = "No";
        //             break;
        //         }
        //     }
        // }

        System.out.println(solve(str, a, b));
    }

    private static boolean check(char s) {
        return '0' <= s && '9' >= s;
    }

    private static String solve(char[] str, int a, int b) {
        for (int i = 0; i < a; i++) {
            if (!check(str[i])) {
                return "No";
            }
        }

        if (str[a] != '-') {
            return "No";
        }

        for (int j = a + 1; j < a + b + 1; j++) {
            if (!check(str[j])) {
            return "No";
            }
        }

        return "Yes";

    }
}

// 順当に設問通りの回答で良い。
// 苦戦した点：コメントアウトの解法と提出した解法で、1問NGが出る差がどこにあるのか分からなかった点。
package Again;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),
               t = sc.next();
        sc.close();

        boolean flag = false;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.equals(t)) {
                flag = true;
                break;
            }

            StringBuffer sb = new StringBuffer();
            sb.append(s.substring(len-1));
            sb.append(s.substring(0, len-1));
            s = sb.toString();
        }

        System.out.println(flag? "Yes":"No");
    }
}

// 問題文通り、記述すればよい。
// 苦戦した点：文字列結合のsubstringで取得した文字列イメージ。
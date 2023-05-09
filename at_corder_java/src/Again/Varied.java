package Again;

import java.util.HashMap;
import java.util.Scanner;

public class Varied {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        sc.close();

        HashMap<String, Integer> map = new HashMap<>();
        String ans = "yes";

        for (String text : str) {
            Integer count = map.get(text);

            if (count == null) {
                map.put(text, 1);
            }
            else {
                ans = "no";
                break;
            }
        }

        System.out.println(ans);
    }
}

// Hashmapを用いて重複をカウント。重複した場合は、即座にループ終了。
// 苦戦した点：特になし。
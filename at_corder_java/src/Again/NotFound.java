package Again;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class NotFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        sc.close();
        Map<Character, Integer> map = new TreeMap<>();

        char c = 'a';

        for (int i = 0; i < 26; i++){
            map.put(c++, 0);
        }

        for (char text : str) {
            map.put(text, map.get(text) + 1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) == 0) {
                System.out.println(key);
                System.exit(0);
            }
        }

        System.out.println("None");
    }
}

// 設問によると、文字列Sに含まれない最小のアルファベットを答える必要があるため、すべてに対して調査をする。
// 苦戦した点：mapを用いて、実装する以外の方法がないか考えること。
package Again;

import java.util.HashMap;
import java.util.Scanner;

public class CountingRoads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            m = Integer.parseInt(sc.next());
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for (int j = 0; j < m*2; j++) {
            int num = Integer.parseInt(sc.next());
            int c = map.get(num) + 1;
            map.put(num, c);
        }

        for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}

// Hashmapにて、各都市をkeyとした、カウンター用Hashmapを用意する。
// 苦戦した点：特になし。
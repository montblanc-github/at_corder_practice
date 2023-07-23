package Again;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Poll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String content = sc.next();
            int count = 1;
            if(map.containsKey(content)){
                count += map.get(content);
            }
            map.put(content, count);
        }

        sc.close();

        List<String> list = new ArrayList<>();
        int maxValue = 0;

          // keySetを使用してMapの要素数分ループする
          for (String nKey : map.keySet()) {
                int value = map.get(nKey);
              if(value >= maxValue) {
                if(value == maxValue) {
                    list.add(nKey);
                } else {
                    list.clear();
                    list.add(nKey);
                }
                maxValue = value;
              }
          }

          for (String str : list) {
            System.out.println(str);
          }
    }
}

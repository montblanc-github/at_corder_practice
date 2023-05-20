package Again;

import java.util.HashMap;
import java.util.Scanner;

public class BeautifulStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = sc.next().split("");
        sc.close();

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : word) {
            Integer count = map.get(str);

            if (count == null) {
                count = 0;
            }

            map.put(str, count + 1);
        }

        boolean flag = true;

        for (String key : map.keySet()) {
			if (map.get(key) % 2 != 0) {
                flag = false;
            }
		}

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

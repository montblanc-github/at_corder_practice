package Again;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Shiritori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String last = null;
        String start, text;
        boolean flag = true;
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            text = sc.next();
            list.add(text);
            if (i != 0) {
                start = text.substring(0, 1);
                if (!start.equals(last)) {
                    flag = false;
                    break;
                }
            }
            if (i != n-1) {
                last = text.substring(text.length()-1);
            }
        }

        sc.close();

        Set<String> set = new HashSet<String>();

        for(String duplicateCheck : list) {
            if(!set.add(duplicateCheck)) {
                flag = false;
                break;
            }
        }

        System.out.println(flag? "Yes": "No");
    }
}

// しりとりのルール通りに記述。
// 苦戦した点：重複チェック。
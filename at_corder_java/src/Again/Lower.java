package Again;

import java.util.*;

public class Lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ans = 0;
        int[] blocks = new int[n];
        boolean[] flag = new boolean[101010];

        for (int i = 0; i < n; i++) {
            blocks[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            if (!flag[i]) {
            flag[i] = true;
                for (int j = i+1; j < n; j++) {
                    if (blocks[j-1] < blocks[j]) {
                        break;
                    }
                    flag[j] = true;
                    ans = Math.max(ans, j-i);
                }
            }
        }

        System.out.println(ans);
    }
}
package Again;

import java.util.Scanner;

public class FoodsLovedByEveryone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            m = Integer.parseInt(sc.next());
        int[] arr = new int[m];

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(sc.next());

            for (int j = 0; j < k; j++) {
                int num = Integer.parseInt(sc.next());
                arr[num - 1]++;
            }
        }

        sc.close();
        int ans = 0;

        for (int p : arr) {
            if (p == n) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

// それぞれの好物の食べ物の順番の配列場所でカウントしていく。
// 苦戦した点：特になし。

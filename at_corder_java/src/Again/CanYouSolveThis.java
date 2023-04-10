package Again;

import java.util.Scanner;

public class CanYouSolveThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            m = Integer.parseInt(sc.next()),
            c = Integer.parseInt(sc.next()),
            ans = 0,
            sum = 0;
        int[] arr = new int[m];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int num : arr) {
                int x = Integer.parseInt(sc.next());
                sum += num * x;
            }
            if (sum + c > 0) {
                ans++;
            }
        }

        sc.close();

        System.out.println(ans);
    }
}

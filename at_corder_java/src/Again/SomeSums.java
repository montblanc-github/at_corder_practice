package Again;

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int copy = i;
            int sum = 0;

            while (copy > 0) {
                sum += copy % 10;
                copy /= 10;
            }

            if (sum >= a && sum <= b) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}

package Again;

import java.util.Arrays;
import java.util.Scanner;

public class AttackSurvival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());

        if (k > q) {
            for (int i = 0; i < n; i++) {
                System.out.println("Yes");
            }
            System.exit(0);
        }

        int[] arr = new int[n];

        Arrays.fill(arr, -q);

        for (int i = 0; i < q; i++) {
            int point = Integer.parseInt(sc.next());
            arr[point - 1]++;
        }

        sc.close();

        for (int num : arr) {
            if (num > -k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

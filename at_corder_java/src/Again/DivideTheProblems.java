package Again;

import java.util.Arrays;
import java.util.Scanner;

public class DivideTheProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        Arrays.sort(arr);

        int num = n / 2;

        if (arr[num] == arr[num - 1]) {
            System.out.println(0);
        } else {
            int ans = arr[num] - arr[num - 1];
            System.out.println(ans);
        }
    }
}

// 中央値の差分が答え。
// 苦戦した点：特になし。
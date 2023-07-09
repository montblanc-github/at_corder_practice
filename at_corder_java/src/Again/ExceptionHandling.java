package Again;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] arr = new int[n];
        int[] num = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
            num[i] = arr[i];
        }

        sc.close();

        Arrays.sort(arr);

        int max = arr[n-1];
        int secondMax = arr[n-2];

        for (int i = 0; i < num.length; i++) {
            if (num[i] == max) {
                System.out.println(secondMax);
            } else {
                System.out.println(max);
            }
        }
    }
}

/**
 * maxの値の時は、二番目のmaxを出力。それ以外はmaxを出力すれば良い。
 */

// 苦戦した点：特になし。

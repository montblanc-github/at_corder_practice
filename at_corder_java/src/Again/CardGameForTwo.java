package Again;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CardGameForTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] arr = new Integer[n];
        int alice = 0,
            bob = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                alice += arr[i];
            } else {
                bob += arr[i];
            }
        }

        System.out.println(alice - bob);
    }
}

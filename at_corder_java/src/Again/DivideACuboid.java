package Again;

import java.util.Arrays;
import java.util.Scanner;

public class DivideACuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.parseLong(sc.next());
            if (arr[i] % 2 == 0) {
                System.out.println(0);
                sc.close();
                System.exit(0);
            }
        }

        sc.close();

        Arrays.sort(arr);

        System.out.println(arr[0] * arr[1]);;

    }
}

// 偶数が含まれる場合、割り切れるため、差分0。それ以外は、積算して最小値となる値が差分となる
// 苦戦した点：なし。
// 工夫する点：配列とするか否か。
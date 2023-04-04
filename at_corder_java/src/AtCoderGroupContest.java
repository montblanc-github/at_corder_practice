import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AtCoderGroupContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] arr = new Integer[3*n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        Arrays.sort(arr, Collections.reverseOrder());

        long ans = 0;

        for (int j = 1, k = 0; k < n; j+=2, k++) {
            ans += arr[j];
        }
        
        // 下記、最大値ではなく、単なる中央値で取得した場合の総和を取る方法。
        // int arg = 0;
        // long ans = 0;

        // for (int j = 0; j < 3; j++) {
        //     for (int k = 0; k < n; k++) {
        //         if (j == 1) {
        //             ans += arr[arg];
        //         }
        //         arg++;
        //     }
        // }

        System.out.println(ans);
    }
}

// すべて中央値に大きい値が含まれるよう合計する。
// 苦戦した点：中央値に大きい値が含まれるようにする場合の二個飛ばしで計算する方法を理解する。

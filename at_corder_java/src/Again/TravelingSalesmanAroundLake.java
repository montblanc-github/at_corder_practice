package Again;

import java.util.Arrays;
import java.util.Scanner;

public class TravelingSalesmanAroundLake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next()),
            n = Integer.parseInt(sc.next());
        int[] arr = new int[n],
              diff = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        sc.close();
        
        for (int i = 0; i < arr.length; i++) {
            if (i == n-1) {
                diff[i] = arr[0] + k - arr[i];
            } else {
            diff[i] = arr[i+1] - arr[i];
            }
        }

        Arrays.sort(diff);

        int ans = Arrays.stream(diff).sum() - diff[n-1];

        // 以下計算式だと、元の配列がソートされないため、結果が異なる。
        // int ans = Arrays.stream(diff).sorted().sum() - diff[n-1];

        System.out.println(ans);
    }
}

// 差分をすべて出して、小さい順で合計する方法→本来は、全体の距離から、一番差分が大きい距離を引けば良いだけ。
// 苦戦した点：streamAPIを用いた場合、元の配列自体は変わらないため、最大値が引けなくなる点。

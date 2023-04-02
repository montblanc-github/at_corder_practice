import java.util.Arrays;
import java.util.Scanner;
// import java.util.Collections;

public class CandyDistributionAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int ans = 0;
        int[] a = new int[n];
        // Integer[] a = new Integer[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        Arrays.sort(a);

        // Arrays.sort(a, Collections.reverseOrder());

        for (int j : a) {
            if (x < j) break;
            ans++;
            x -= j;
        }

        if (n == ans && x != 0) {
            ans--;
        }

        // for (Integer j : a) {
        //     if (x < j && x != j) break;
        //     ans++;
        //     x -= j;
        // }

        // if (x > 0) {
        //     ans--;
        // }

        System.out.println(ans);

    }
}

// 配列を降順にソート→降順でXから引いていく（引けたときはansを+1）→＜結果＞残り数が10で配列が10の時、ansが+1されなくなる。
// 配列を昇順にソート→昇順でXから引いていく（引けたときはansを+1）→人数nとansが同値かつ、残り数xが0で無いとき、-1。→＜結果＞正解。
// 苦戦した点：入力例2のn=3,x=10,a[]=[20,30,10]の時に、降順だと不都合が生じる点。解消できず。
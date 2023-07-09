package Again;

import java.util.Scanner;

public class CountOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] p = new int[n];
        int[] q = new int[n];

        for (int i = 0; i < p.length; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        for (int j = 0; j < q.length; j++) {
            q[j] = Integer.parseInt(sc.next());
        }

        sc.close();

        int pCount = count(p);
        int qCount = count(q);

        System.out.println(Math.abs(pCount - qCount));
    }

     
    public static int count(int[] a){
        int ret = 0;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int m = a[i];
            int mPos = 0;
            for (int j = i+1; j < n; j++) {
                if(a[j] < m) mPos++;
            }
            int tmp = 1;
            for (int j = 1; j < n-i; j++) {
                tmp *= j;
            }

            ret += tmp * mPos;
        }
        return ret;
    }
}

/** countのロジックは、別回答者の内容を引用。
 * 詳細としては、mPosで辞書順でその番号の羅列になるまでの場合の数を算出。例えば先頭番号が7の時は、6始まりまでの6通りがmPos。
 * tmpで対象番号以降の順列の場合の数を算出。例えば、8桁の数の先頭番号以降7桁の順列数である5040通りがtmp。
 * それを最後に掛け合わせて足すと、そこまでの数値の場合の数をすべて算出して、計算できる。
*/

// 苦戦した点：全探索も可能だが、全探索しない早いロジックを考えること。他者の考えたロジックの理解。
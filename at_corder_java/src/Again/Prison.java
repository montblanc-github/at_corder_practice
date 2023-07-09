package Again;

import java.util.Scanner;

public class Prison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            m = Integer.parseInt(sc.next()),
            l = Integer.parseInt(sc.next()),
            r = Integer.parseInt(sc.next());
 
        for(int i=0; i<m-1; i++){
            l = Math.max(l, Integer.parseInt(sc.next()));
            r = Math.min(r, Integer.parseInt(sc.next()));
        }
 
        sc.close();
        int ans = r-l+1;
 
        if(ans<0){
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}

/**
 * ゲート数分の配列の範囲内にあるIDカードの個数が答え。
 * ゲート数分の配列を一つ一つ判断すると計算量が多くなるため、すべてのゲートの持つ配列の重なる範囲を求めてその差分を算出すればよい。
 */

// 苦戦した点：特になし。

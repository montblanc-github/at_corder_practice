import java.util.Scanner;

public class small_and_large_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()), b = Integer.parseInt(sc.next()), k = Integer.parseInt(sc.next());
        sc.close();

        // 等間隔で決められた範囲を出力するため、配列は用いなくて良い。
        // 与えられた数値範囲の個数よりkの個数の方が多くなる可能性があるため、どちらか一方を取るように配慮する。
        for(int i=a; i<=Math.min(b, a+k-1); i++){
            System.out.println(i);
        }

        // 上記小さい順の数値と大きい順の数が重複しないよう、a+kで調整。
        for(int j=Math.max(b-k+1, a+k); j<=b; j++){
            System.out.println(j);
        }
    }
}
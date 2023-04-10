package Again;

import java.util.Scanner;

public class PowerSocket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next()),
            ans = 0,
            num = 1;
        sc.close();

        while (num < b){
            num--;
            num += a;
            ans++;
        };

        System.out.println(ans);
    }

}

// A-1個ずつ増えていくので、その合計値がＢを超えたときの個数が正解。
// 苦戦した点：dowhile文を用いた結果、while文と異なる挙動となるため、不正解となった点。

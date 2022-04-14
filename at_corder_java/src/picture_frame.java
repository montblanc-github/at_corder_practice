import java.util.Scanner;
import java.util.Arrays;

public class picture_frame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nextIntを用いるより、下記のInteger.parseInt(sc.next())の方が実行速度が速い。
        int h = Integer.parseInt(sc.next()), w = Integer.parseInt(sc.next());
        String[] a = new String[h];
        char[][] s = new char[h+2][w+2];

        // 配列の要素すべてに同じ値を与える処理。
        for(char[] val : s){
            Arrays.fill(val, '#');
        }

        for(int i = 0; i < h; i++){
            // nextLineを用いると最初の要素が空になる。
            a[i] = sc.next();
        }

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                // charAt()で一文字ずつの要素にしてから、代入。
                s[i+1][j+1] = a[i].charAt(j);
            }
        }

        for(int i = 0; i < h+2; i++){
            System.out.println(s[i]);
        }

        sc.close();
    }
}
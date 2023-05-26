package Again;

import java.util.Arrays;
import java.util.Scanner;

public class PictureFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next()), w = Integer.parseInt(sc.next());
        String[] a = new String[h];
        char[][] s = new char[h+2][w+2];
 
        for(char[] val : s){
            Arrays.fill(val, '#');
        }
 
        for(int i = 0; i < h; i++){
            a[i] = sc.next();
        }
 
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                s[i+1][j+1] = a[i].charAt(j);
            }
        }
 
        for(int i = 0; i < h+2; i++){
            System.out.println(s[i]);
        }
 
        sc.close();

    }
}

// 最初と最後は＃のみ→＃のみの文字列生成。その他は文字列に置き換える。
// 苦戦した点：規定の処理量内で収める、かつ、余計は改行や余計な出力がされないよう注意。
package Again;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(),
               b = sc.next();
        sc.close();

        int diff = a.compareTo(b);

        if (a.length() < b.length() || diff < 0) {
            System.out.println("LESS");
        } else if (diff == 0) {
            System.out.println("EQUAL");
        } else {
            System.out.println("GREATER");
        }
    }
}

// 通常通りに比較しようとすると、LONG型で比較できないため、String型で比較。
// 苦戦した点：通常の数値として比較出来ない場合、桁数以外どのように比較していくのか。

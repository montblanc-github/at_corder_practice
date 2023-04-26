package Again;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person = Integer.parseInt(sc.next()),
            day = Integer.parseInt(sc.next()),
            c = Integer.parseInt(sc.next()),
            num = 0;
        
        for (int i = 0; i < person; i++) {
            c++;
            int a = Integer.parseInt(sc.next());
            num = a;

            while (num < day) {
                c++;
                num += a;
            }
        }

        sc.close();

        System.out.println(c);
    }
}

// 全員1日目は食べるため、人数分＋それぞれの期間内に食べる量となる。
// 苦戦した点：numへの代入箇所とループの箇所と条件を考えるのにやや苦戦。
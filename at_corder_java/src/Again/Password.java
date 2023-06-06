package Again;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] o = sc.next().toCharArray();
        char[] e = sc.next().toCharArray();
        sc.close();

        for (int i = 0; i < e.length; i++) {
            System.out.print(o[i]);
            System.out.print(e[i]);
        }

        if (o.length > e.length) {
            System.out.print(o[o.length-1]);
        }
    }
}

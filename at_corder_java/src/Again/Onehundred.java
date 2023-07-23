package Again;

import java.util.Scanner;

public class Onehundred {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        sc.close();
        int cnt = X / 100;
        X %= 100;

        System.out.println(X <= cnt*5 ? "1" : "0");
    }
}

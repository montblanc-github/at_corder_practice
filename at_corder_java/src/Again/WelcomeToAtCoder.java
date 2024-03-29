package Again;

import java.util.Scanner;

public class WelcomeToAtCoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next()),
                  M = Integer.parseInt(sc.next());

        boolean[] solved = new boolean[N];
        int[] wa = new int[N];
        int ac = 0;

        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(sc.next()) - 1;
            String s = sc.next();

            if (s.equals("AC")) {
                if (!solved[p]) {
                    solved[p] = true;
                    ac++;
                }
            } else {
                if (!solved[p]) {
                    wa[p]++;
                }
            }
        }

        sc.close();

        int kk = 0;
        for (int i = 0; i < N; i++) {
            if (solved[i]) {
                kk += wa[i];
            }
        }

        System.out.println(ac + " " + kk);
    }
}

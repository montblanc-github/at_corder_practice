package Again;

import java.util.Scanner;

public class FiveDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int longestWait = 10;
        int wait = 0;
        
        for (int i = 0; i < 5; i ++) {
            int in = Integer.parseInt(sc.next());
            wait += 10 * (int) Math.ceil((double) in / 10);
            if (in % 10 < longestWait && in % 10 != 0)
                longestWait = in % 10;
        }
        
        sc.close();

        System.out.println(wait - 10 + longestWait);
    }
}
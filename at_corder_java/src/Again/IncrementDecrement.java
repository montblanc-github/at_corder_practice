package Again;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] str = sc.next().split("");
        sc.close();

        int x = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            String text = str[i];

            if (text.equals("I")) {
                x++;
            } else if (text.equals("D")) {
                x--;
            }

            if (x > max) {
                max = x;
            }
        }

        System.out.println(max);
    }
}

package Again;

import java.util.Scanner;

public class TaxIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int A = Integer.parseInt(sc.next()),
                  B = Integer.parseInt(sc.next());
 
        sc.close();
        
        for (int i = 0; i < 1001; i++) {
            int a = i * 8 / 100;
            int b = i * 10 / 100;
 
            if (a == A && b == B) {
                System.out.print(i);
                return;
            }
        }
 
        System.out.println(-1);
    }
}

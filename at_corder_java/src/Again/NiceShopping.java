package Again;

import java.util.Arrays;
import java.util.Scanner;

public class NiceShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next()),
            m = Integer.parseInt(sc.next());
        int[] refrigerators = new int[a],
              microwaves = new int[b],
              coupon_prices = new int[m];
        
        int min_refrigerator = 1000000,
            min_microwave = 1000000;

        for (int i = 0; i < refrigerators.length; i++) {
            refrigerators[i] = Integer.parseInt(sc.next());
            if (min_refrigerator > refrigerators[i]) {
                min_refrigerator = refrigerators[i];
            }
        }

        for (int j = 0; j < microwaves.length; j++) {
            microwaves[j] = Integer.parseInt(sc.next());
            if (min_microwave > microwaves[j]) {
                min_microwave = microwaves[j];
            }
        }

        for (int k = 0; k < coupon_prices.length; k++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());

            coupon_prices[k] = refrigerators[x-1] + microwaves[y-1] - c;
        }

        sc.close();
        Arrays.sort(coupon_prices);

        System.out.println(Math.min(coupon_prices[0], min_microwave + min_refrigerator));
    }
}
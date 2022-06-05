import java.util.Scanner;

public class ColoringColorfully {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] colors = sc.next().toCharArray();
        sc.close();

        int n = colors.length,
            cnt1 = 0,
            cnt2 = 0;

        char[] sample1 = new char[n],
               sample2 = new char[n];

        // 10101...
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sample1[i] = '0';
            } else {
                sample1[i] = '1';
            }
        }

        // 01010...
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sample2[i] = '1';
            } else {
                sample2[i] = '0';
            }
        }

        for (int i = 0; i < n; i++) {
            if(colors[i] != sample1[i]) cnt1++;
            if(colors[i] != sample2[i]) cnt2++;
        }

        System.out.println(Math.min(cnt1, cnt2));
    }
}

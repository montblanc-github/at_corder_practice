import java.util.Scanner;

public class LowElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            cnt = 0,
            j = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(sc.next());
            if(p <= j) {
                cnt++;
                j = p;
            }
        }

        sc.close();

        System.out.println(cnt);

    }
}

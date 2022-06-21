import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximalValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        int[] arr = new int[N-1];

        for (int i = 0; i < N-1; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        int ans = 0;

        ans += arr[0];

        for (int i = 1; i < N-1; i++) {
            ans += Math.min(arr[i-1], arr[i]);
        }

        ans += arr[N-2];

        System.out.println(ans);
    }
}
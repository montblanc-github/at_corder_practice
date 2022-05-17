import java.util.Arrays;
import java.util.Scanner;

public class AtCorderGroupContest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            val = 3*n;

        long[] arr = new long[val];

        for(int i=0; i<val; i++) arr[i] = Long.parseLong(sc.next());

        sc.close();

        Arrays.sort(arr);

        long ans = 0;

        for(int j=0; j<n; j++){
            ans += arr[3*n-2-j*2];
        }

        System.out.println(ans);
    }
}
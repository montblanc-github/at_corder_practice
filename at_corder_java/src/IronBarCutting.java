import java.util.Scanner;

public class IronBarCutting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long s = 0;

        for(int i=0; i<n; i++){
            a[i] = Long.parseLong(sc.next());
            s += a[i];
        }

        sc.close();

        long min = s,
             sum = 0;

        for(int j=0; j<n; j++){
            sum += a[j];
            min = Math.min(min, Math.abs(sum-(s-sum)));
        }

        System.out.println(min);
    }
}
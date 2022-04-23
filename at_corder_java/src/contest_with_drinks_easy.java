import java.util.Arrays;
import java.util.Scanner;

public class contest_with_drinks_easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] q = new int[n], ans = new int[n];

        for(int i=0; i<n; i++){
            q[i] = Integer.parseInt(sc.next());
        }

        int m =Integer.parseInt(sc.next());

        for(int j=0; j<m; j++){
            int k = Integer.parseInt(sc.next()), sum = 0;
            ans = Arrays.copyOf(q, n);
            ans[k-1] = Integer.parseInt(sc.next());
            for (int val : ans){
                sum += val;
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
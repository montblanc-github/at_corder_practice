import java.util.Arrays;
import java.util.Scanner;

public class ChristmasEve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next()),
                  K = Integer.parseInt(sc.next());

        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        Arrays.sort(trees);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N - K + 1; i++) {
            int treeMax = i + K - 1;
            ans =  Math.min(ans, (trees[treeMax] - trees[i]));
        }

        System.out.println(ans);
    }
}
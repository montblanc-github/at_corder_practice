import java.util.Arrays;
import java.util.Scanner;

public class Alchemist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] v = new int[n];

        for(int i=0; i<n; i++){
            v[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        Arrays.sort(v);
        double a = v[0];

        for(int k=0; k<n; k++){
            a += v[k];
            a = a/2.0;
        }

        System.out.println(a);
    }
}

import java.util.Scanner;

public class Rally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()), ans = 1000000000;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        for(int j=1; j<=100; j++){
            int cost = 0;
            for(int k=0; k<n; k++){
                cost += (arr[k]-j)*(arr[k]-j);
            }
            ans = Math.min(ans, cost);
        }

        System.out.println(ans);
    }
}
import java.util.Scanner;

public class TravelingSalesmanAroundLake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next()),
            n = Integer.parseInt(sc.next());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        int max = k - arr[n-1] + arr[0];

        for(int j=1; j<n; j++){
            max = Math.max(max, (arr[j]-arr[j-1]));
        }

        int ans = k - max;

        System.out.println(ans);
    }
}
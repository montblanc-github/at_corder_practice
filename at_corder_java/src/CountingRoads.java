import java.util.Scanner;
import java.util.Arrays;

public class CountingRoads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()), m = Integer.parseInt(sc.next());

        // カウンター用配列を用意する。
        int[] arr = new int[n];
        Arrays.fill(arr, 0);

        // 入力された都市の個数をカウンター用配列で数える。
        for(int i=1; i<=m*2; i++){
            int x = Integer.parseInt(sc.next());
            arr[x-1] += 1;
        }

        sc.close();

        for(int val : arr){
		    System.out.println(val);
		}
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class DivideTheProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        Arrays.sort(arr);
        int h = n/2;

        System.out.println(arr[h]-arr[h-1]);

    }
}
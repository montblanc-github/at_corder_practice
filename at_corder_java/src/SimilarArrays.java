import java.util.Scanner;

public class SimilarArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            all = 1,
            bad = 1;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.next());
            all *= 3;
            if(arr[i]%2==0) bad *= 2;
        }

        sc.close();

        System.out.println(all-bad);

    }
}

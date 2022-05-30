import java.util.Arrays;
import java.util.Scanner;

public class AttackSurvival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
             k = Integer.parseInt(sc.next()),
             q = Integer.parseInt(sc.next());
        int[] arr = new int[n];

        Arrays.fill(arr, k-q);

        for (int i = 0; i < q; i++) {
            int a = Integer.parseInt(sc.next());
            arr[a-1]++;
        }

        sc.close();

        for (int score : arr){
            if(score <= 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] arr = new int[n],
              max = new int[3];

        for(int i = 0; i < n; i++){
            int x = arr[i] = Integer.parseInt(sc.next());
            max[0] = x;
            Arrays.sort(max);
        }

        sc.close();

        for(int j = 0; j < n; j++){
            if(max[2] == arr[j]){
                System.out.println(max[1]);
            } else {
                System.out.println(max[2]);
            }
        }
    }
}
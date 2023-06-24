package Again;

import java.util.Scanner;

public class PaintingBallsWithAtCoDeer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            k = Integer.parseInt(sc.next());
        sc.close();
 
        long ans = k;
 
        for(int i=0; i<n-1; i++){
            ans *= k-1;
        }
 
        System.out.println(ans);
    }
}

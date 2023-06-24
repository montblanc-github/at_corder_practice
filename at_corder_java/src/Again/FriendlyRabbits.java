package Again;

import java.util.Scanner;

public class FriendlyRabbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
 
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next())-1;
        }
 
        sc.close();
 
        int cnt = 0;
 
        for(int j=0; j<n; j++){
            if(a[a[j]]==j) cnt++;
        }
 
        System.out.println(cnt/2);
    }
}

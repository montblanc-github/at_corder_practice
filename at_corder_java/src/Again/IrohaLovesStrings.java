package Again;

import java.util.Arrays;
import java.util.Scanner;

public class IrohaLovesStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            l = Integer.parseInt(sc.next());

            String[] arr = new String[n];
 
            for(int i=0; i<n; i++){
                arr[i] = sc.next();
            }
     
            sc.close();
     
            Arrays.sort(arr);
     
            String ans = String.join("", arr);
     
            System.out.println(ans);
     
    }
}

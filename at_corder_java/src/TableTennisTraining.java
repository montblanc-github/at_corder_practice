import java.util.Scanner;

public class TableTennisTraining {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next()),
             a = Long.parseLong(sc.next()),
             b = Long.parseLong(sc.next()),
             ans = 0;
        sc.close();

        if ((a%2==0 && b%2==0) || (a%2!=0 && b%2!=0)) {
            ans = (b-a)/2;
        } else {
            long minTable = Math.min(a-1, n-b);
            ans = minTable+1+(b-a-1)/2;
        }

        System.out.println(ans);
    }
}
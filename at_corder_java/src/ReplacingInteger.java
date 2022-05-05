import java.util.Scanner;

public class ReplacingInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next()),
             k = Long.parseLong(sc.next());
        sc.close();

        long ans = Math.min(n%k, k-(n%k));

        System.out.println(ans);
    }
}
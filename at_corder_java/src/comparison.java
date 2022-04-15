import java.util.Scanner;

public class comparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String A = sc.next(), B = sc.next();
        sc.close();

        if ( A.length() > B.length() ) {
            System.out.println("GREATER");
        }
        else if( A.length() < B.length() ) {
            System.out.println("LESS");
        }
        else {
            final int ans = A.compareTo(B);
            System.out.println(ans == 0 ? "EQUAL" : ans > 0 ? "GREATER" : "LESS");
        }
    }
}
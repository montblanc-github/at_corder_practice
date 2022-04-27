import java.util.Scanner;

public class AToZString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int start = s.indexOf('A'), last = s.lastIndexOf('Z');

        String ans = s.substring(start, last+1);

        System.out.println(ans.length());
    }

}

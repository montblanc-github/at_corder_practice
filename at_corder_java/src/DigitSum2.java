import java.util.Scanner;

public class DigitSum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        if(n<10){
            System.out.println(n);
            System.exit(0);
        }

        String s = String.valueOf(n);
        int a = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            a += (c - '0');
        }

        int b = (s.charAt(0) - '0' - 1) + (s.length() - 1) * 9;
        System.out.println(Math.max(a,b));


    }
}
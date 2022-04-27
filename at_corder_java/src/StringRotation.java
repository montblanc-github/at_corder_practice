import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        sc.close();
        int len = s.length();
        boolean ans = false;

        for(int i = 0; i < len; i++){
            if(s.equals(t)){
                ans = true;
                break;
            }
            s = s.substring(len-1) + s.substring(0,len-1);
        }

        System.out.println(ans ? "Yes" : "No");

    }
}
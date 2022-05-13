import java.util.*;

public class DividingAString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), a="", b="";
        sc.close();
        int cnt = 0;

        for(int i=0; i<s.length(); i++){
            b += s.charAt(i);
            System.out.println(b);
            if(!a.equals(b)){
                a=b;
                b="";
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
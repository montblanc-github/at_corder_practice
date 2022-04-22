import java.util.Scanner;

public class accepted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        boolean ans = true;
        char[] c = s.toCharArray();
        int len = s.length(), cnt = 0;

        if(s.charAt(0) != 'A')ans = false;

        for(int i=1; i<len; i++){
            if(Character.isUpperCase(c[i])){
                if(i==1 || i == len-1 || c[i] != 'C'){
                    ans = false;
                }
                cnt++;
            }
        }

        if(cnt != 1){
            ans = false;
        }

        System.out.println(ans ? "AC" : "WA");
    }
}
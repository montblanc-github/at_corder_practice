import java.util.Scanner;

public class passwordIntegration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o = sc.next(), e = sc.next();
        StringBuilder ans = new StringBuilder();
        sc.close();

        int l = o.length() + e.length();

        for(int i=0; i<l; i++){
            if(i%2==0){
                ans.append(o.charAt(i/2));
            } else {
                ans.append(e.charAt(i/2));
            }
        }

        System.out.println(ans.toString());

    }
}
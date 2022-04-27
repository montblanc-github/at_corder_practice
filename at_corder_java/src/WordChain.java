import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class WordChain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        boolean ans = true;
        String s = sc.next();

        List<String> list = new ArrayList<String>();

        for(int i=0; i<n-1; i++){
            String m = sc.next();
            if((s.charAt(s.length()-1) != m.charAt(0))){
                ans = false;
                break;
            }

            list.add(s);
            s = m;

            if(list.contains(m)){
                ans = false;
                break;
            }
        }

        System.out.println(ans ? "Yes" : "No");

    }
}
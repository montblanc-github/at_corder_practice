import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class palace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()), t = Integer.parseInt(sc.next()), a = Integer.parseInt(sc.next());
        Map<Double, Integer> ans = new TreeMap<Double, Integer>();

        for(int i=1; i<=n; i++){
            int x = Integer.parseInt(sc.next());
            double r = t-x*0.006;
            double d = Math.abs(r-a);
            ans.put(d, i);
        }

        sc.close();
        List<Integer> list = new ArrayList<>(ans.values());

        System.out.println(list.get(0));
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Guidebook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Shop> shops = new ArrayList<>();

        for(int i=1; i<=n; i++){
            String S = sc.next();
            int P = Integer.parseInt(sc.next());
            shops.add(new Shop(S, P, i));
        }

        shops.sort(Comparator.comparing(Shop::getS).thenComparing(Comparator.comparing(Shop::getP).reversed()));

        for (Shop sp : shops) {
            System.out.println(sp.id);
        }

    }

    private static class Shop{
        String S;
        int P;
        int id;

        Shop(String S, int P, int id){
            this.S = S;
            this.P = P;
            this.id = id;
        }

        public String getS() {
            return S;
        }

        public int getP() {
            return P;
        }
    }
}
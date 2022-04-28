import java.util.Scanner;

public class WannaGoBackHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        boolean south = s.contains("S"), north = s.contains("N"), west = s.contains("W"), east = s.contains("E");

        // 移動距離が決められていないため、南北/東西それぞれのペアが存在もしくは、無い状態であれば問題無い。
        if((!south && north) || (south && !north) || (!west && east) || (west && !east)){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}

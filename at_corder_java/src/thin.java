import java.util.Scanner;

public class Thin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next()), w = Integer.parseInt(sc.next());

        for(int i=0; i<h; i++){
            String str = sc.next();
            for(int j=0; j<2; j++){
                System.out.println(str);
            }
        }

        sc.close();
    }
}
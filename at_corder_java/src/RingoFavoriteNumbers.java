import java.util.Scanner;

public class RingoFavoriteNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next()),
            n = Integer.parseInt(sc.next());
        sc.close();

        long num = 1;

        for(int i=0; i<d; i++) num*=100;

        if(n<=99){
            System.out.println(num*n);
        } else {
            System.out.println(num*101);
        }
    }
}
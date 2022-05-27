import java.util.Scanner;

public class CaracalVsMonster{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next()),
             n = 1,
             sum = 0;
        sc.close();

        while (h>0) {
            sum += n;
            h /= 2;
            n *= 2;
        }

        System.out.println(sum);
    }
}
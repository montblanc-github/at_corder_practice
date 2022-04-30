import java.util.Scanner;

public class TrainingCamp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans=1, m =(long) Math.pow(10, 9)+7;
        sc.close();

        for(int i=1; i<=n; i++){
            ans = ans*i%m;
        }

        System.out.println(ans);
    }
}
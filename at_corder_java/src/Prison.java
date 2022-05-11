import java.util.Scanner;

public class Prison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            m = Integer.parseInt(sc.next()),
            l = Integer.parseInt(sc.next()),
            r = Integer.parseInt(sc.next());

        if(m==1){
            System.out.println(r-l+1);
            System.exit(0);
        }

        for(int i=0; i<m-1; i++){
            l = Math.max(l, Integer.parseInt(sc.next()));
            r = Math.min(r, Integer.parseInt(sc.next()));
        }

        sc.close();
        int ans = r-l+1;

        // すべてのゲートを通過できるIDカードが存在しない可能性がある。
        if(ans<0){
            System.out.println(0);
        } else {
            System.out.println(ans);
        }

    }
}
import java.util.Scanner;

// 提出は、Mainクラスでしないと、コンパイルエラーになる。
public class LucasNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // (要注意)配列の要素数は、n+1になる
        long[] l = new long[n+1];
        l[0] = 2;
        l[1] = 1;

        for(int i=2;i<=n;i++){
            l[i] = l[i-2] + l[i-1];
        }

        // System.out.println(Arrays.toString(l));

        System.out.println(l[n]);

        sc.close();
    }
}

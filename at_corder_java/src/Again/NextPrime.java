package Again;

import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        boolean[] primeNums = findPrimes(1000000);

        for (int i = x; i < primeNums.length; i++) {
            if (primeNums[i]) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean[] findPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}

// エラトステネスのふるいを用いて、素数の配列を作成。
// 苦戦した点：配列から最小値を取得する方法。
// 改善点：エラトステネスのふるいの原理を活用して、すべての配列を生成せずに回答する方法があると、さらに高速化できる。。
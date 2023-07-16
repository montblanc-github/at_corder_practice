package Again;

import java.util.Scanner;

public class LowElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }

        sc.close();
        int min = nums[0];
        int ans = 0;

        for (int num : nums) {
            if (num <= min) {
                ans++;
                min = num;
            }
        }

        System.out.println(ans);
    }
}

/**
 * 問題文が分かりづらいが、i番目までの値を比較したとき、i番目が最小値となる数を求めればよい。
 * そこまでの最小値となる値をminで保持しておき、min以下となる値が現れたら、ansを+1すれば良い。
 */
// 苦戦した点：問題文の読解。
package Again;

import java.util.Scanner;

public class ShiftOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        boolean isEven = true;
        long[] nums = new long[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Long.parseLong(sc.next());
            if (nums[i] % 2 != 0) {
                isEven = false;
            }
        }

        sc.close();

        int count = 0;

        if (isEven) {
            while (isEven) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] /= 2;
                    if (nums[i] % 2 != 0) {
                        isEven = false;
                    }
                }
                count++;
            }
        }

        System.out.println(count);
    }
}

// 問題文通り、配列の中身が偶数の間は、2で割り続ける。
// 苦戦した点：特になし。
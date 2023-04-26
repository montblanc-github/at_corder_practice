package Again;

import java.util.Scanner;

public class CollatzProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        sc.close();

        int num = s;

        for (int i = 1; i < 1000000; i++) {
            if (num == 4 || num == 2 || num == 1) {
                System.out.println(i + 3);
                break;
            } else {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = (3 * num + 1);
                }
            }
        }
    }
}

// 4，2，1が現れた瞬間に答えが＋3となるため、その条件に当てはまるまで、順当に繰り返す。
// 苦戦した点：特になし。
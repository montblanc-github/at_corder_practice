package Again;

import java.util.Scanner;

public class QualificationSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            a = Integer.parseInt(sc.next()),
            b = Integer.parseInt(sc.next()),
            rank = 1,
            foreign = 0,
            border = a + b;
        String[] participants = sc.next().split("");
        sc.close();

        String person = null;

        for (int i = 0; i < n; i++) {
            person = participants[i];
            if (person.equals("c")) {
                PrintNo();
            } else if (person.equals("a")) {
                if (rank <= border) {
                    PrintYes();
                    rank++;
                } else {
                    PrintNo();
                }
            } else if (person.equals("b")) {
                if (rank <= border && foreign < b) {
                    PrintYes();
                    rank++;
                } else {
                    PrintNo();
                }
                foreign++;
            }
        }

    }

    private static void PrintYes() {
        System.out.println("Yes");
    }

    private static void PrintNo() {
        System.out.println("No");
    }
}

// 設問通りの回答で問題無い。
// 苦戦した点：順位を予選通過順位と取る必要があるのに、全体順位として捉えてしまった点。ケアレスミス。
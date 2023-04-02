import java.util.HashMap;
import java.util.Scanner;

public class WannaGoBackHomeAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        sc.close();
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();

        countMap.put("N", 0);
        countMap.put("W", 0);
        countMap.put("S", 0);
        countMap.put("E", 0);

        for (String word : str) {
            countMap.put(word, countMap.get(word)+1);
        }

        if ((countMap.get("N") > 0 && countMap.get("S") > 0) && (countMap.get("W") > 0 && countMap.get("E") > 0)) {
            System.out.println("Yes");
        } else if ((countMap.get("N") > 0 && countMap.get("S") > 0) && (countMap.get("W") == 0 && countMap.get("E") == 0)) {
            System.out.println("Yes");
        } else if ((countMap.get("N") == 0 && countMap.get("S") == 0) && (countMap.get("W") > 0 && countMap.get("E") > 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// 問題では、1移動に対する距離が問われていないため、南北と東西がそれぞれペアになっていればよい。→＜結果＞正解。
// 苦戦した点：ペアを作っているかどうかMapを使用する点。

package Again;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GoToSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()),
            num = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(sc.next());
            arr[num - 1] = i + 1;
        }

        System.out.print(
            Arrays.stream(arr)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "))
        );

    }
}

// 入力された生徒数の順番ごとに出席番号を並べれば良い。
// 苦戦した点：配列の出力は[]がついてしまうため、スペース区切りで出力する方法も探すのに苦労した。
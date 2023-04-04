import java.util.Scanner;

public class DigitSumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = Long.parseLong(sc.next()),
             answer = 0;
        sc.close();

        // あらかじめ1を足しておく。例えば、99のような場合の不都合を回避するため。
        number++;

        // 各桁を10で割りながら、数を足す。
        while (number != 0) {
            if (number < 10) {
                answer += number -1;
            } else {
                answer += 9;
            }
            number /= 10;
        }

        System.out.println(answer);
    }
}

// 一度回答済みの問題となり、学習目的として、他回答を参考に記述。
// 苦戦した点：漸化式の内容と入力例の矛盾を読み解くのに時間を要した。
// →9995の場合、9989が最大値となる。しかし、8999も同様。そのため、漸化式の内容と矛盾なしと出来る。
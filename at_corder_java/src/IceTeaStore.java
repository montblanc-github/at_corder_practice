import java.util.Arrays;
import java.util.Scanner;

public class IceTeaStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.next()),
            h = Integer.parseInt(sc.next()),
            s = Integer.parseInt(sc.next()),
            d = Integer.parseInt(sc.next()),
            n = Integer.parseInt(sc.next());
        sc.close();

        int[] arrTwo = {q*8,h*4,s*2,d};
        int[] arrOne = {q*4,h*2,s};

        int minTwo = minArray(arrTwo),
            minOne = minArray(arrOne);

        long ansEven = n/2,
             ansOdd = n%2;

        System.out.println(ansEven*minTwo+ansOdd*minOne);
    }

    public static int minArray(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }

}
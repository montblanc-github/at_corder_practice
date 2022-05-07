import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class GoToSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        // TreeMapを用いて、生徒数順にソートしながら、出席番号をペアに持たせる。
        Map<Integer,Integer> map = new TreeMap<Integer, Integer>();

        for(int i=1; i<=n; i++){
            map.put(Integer.parseInt(sc.next()),i);
        }

        for(Integer key : map.keySet()){
            System.out.print(map.get(key)+" ");
        }
    }
}
package Again;

import java.util.HashMap;
import java.util.Scanner;

public class TwoColorsCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<String, Integer> map = new HashMap<>();
 
        for(int i=0; i<n; i++){
            String word = sc.next();
            int cnt = 1;
            if(map.containsKey(word)){
                cnt += map.get(word);
            }
            map.put(word, cnt);
        }
 
        int m = Integer.parseInt(sc.next());
 
        for(int j=0; j<m; j++){
            String word = sc.next();
            int cnt = -1;
            if(map.containsKey(word)){
                cnt += map.get(word);
            }
            map.put(word, cnt);
        }
 
        Integer maxValue = 0;
      
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
            maxValue = entry.getValue();
            }
        }
        
        System.out.println(maxValue);
    }
}

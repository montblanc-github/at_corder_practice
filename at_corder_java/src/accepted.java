import java.util.Scanner;

public class accepted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        char[] c = s.toCharArray();
        int len = s.length(), cnt = 0;

        if(s.charAt(0) != 'A'){
            System.out.println("WA");
            System.exit(0);
        }

        // 2文字目以降の小文字判定と、3文字目から末尾から2文字目までの大文字Cの個数カウントを同時に行う処理。
        for(int i=1; i<len; i++){
            if(Character.isUpperCase(c[i])){
                if(i==1 || i == len-1 || c[i] != 'C'){
                    System.out.println("WA");
                    System.exit(0);
                }
                cnt++;
            }
        }

        if(cnt != 1){
            System.out.println("WA");
            System.exit(0);
        }

        System.out.println("AC");
    }
}
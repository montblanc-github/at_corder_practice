import java.util.Scanner;

public class good_distance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()), d = Integer.parseInt(sc.next()), ans=0;
        int[][] arr = new int[n][d];

        for(int i=0; i<n; i++){
            for(int j=0; j<d; j++){
                arr[i][j] = Integer.parseInt(sc.next());
            }
        }

        sc.close();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum = 0;

                for(int k=0; k<d; k++){
                    sum += (arr[i][k]-arr[j][k]) * (arr[i][k]-arr[j][k]);
                }

                double sq = Math.sqrt(sum);
                if(sq == Math.floor(sq)){
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}
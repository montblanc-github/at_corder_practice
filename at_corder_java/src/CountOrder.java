import java.util.*;

public class CountOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] p = new String[n],
                 q = new String[n];

        for(int i=0; i<n*2; i++){
            if(i<n){
                p[i] = sc.next();
            } else {
                q[i-n] = sc.next();
            }
        }
        sc.close();

        if(Arrays.equals(p, q)){
            System.out.println(0);
            System.exit(0);
        }

        String[] seed = Arrays.copyOf(p, n);
        Arrays.sort(seed);
        ArrayList<String> seedList = new ArrayList<String>();
        // Collections.addAllはIntegerだとエラーになる！
        Collections.addAll(seedList, seed);

        ArrayList<ArrayList<String>> res = permute(seedList);

        int cnt = 1, pIndex = 0, qIndex = 0;
        List<String> pList = Arrays.asList(p);
        List<String> qList = Arrays.asList(q);

        for(ArrayList<String> c : res){
            if(c.equals(pList)){
                pIndex = cnt;
            } else if (c.equals(qList)){
                qIndex = cnt;
            }
            cnt++;
        }

        System.out.println(Math.abs(pIndex-qIndex));

    }

    static ArrayList<ArrayList<String>> permute(ArrayList<String> a) {
        ArrayList<ArrayList<String>> toReturn = new ArrayList<ArrayList<String>>();
        if( a.size() == 1 ){
            toReturn.add( new ArrayList<String>(a) );
            return toReturn;
        }

        for( int i = 0 ; i < a.size(); i++ ){
            String current = a.get( i );
            ArrayList<String> tmp = new ArrayList<String>(a);
            tmp.remove( i );

           ArrayList<ArrayList<String>> res = permute(tmp);

           for( int j = 0 ; j < res.size() ; j++ ){
               ArrayList<String> toAdd = new ArrayList<String>();
               toAdd.add( current );
               toAdd.addAll( res.get( j ) );
               toReturn.add( toAdd );
           }
        }

        return toReturn;
    }

}
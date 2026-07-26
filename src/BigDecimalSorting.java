import java.math.BigDecimal;
import java.util.*;

public class BigDecimalSorting {
    public static void main (String[] args){
        example1();

    }
    public static void example1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];

        for (int i=0; i<n; i++){
            s [i] = sc.next();
        }

        Arrays.sort(s,0,n,new Comparator<String>() {

            @Override
            public int compare (String s1,String s2){

                BigDecimal b1 = new BigDecimal (s1);
                BigDecimal b2 = new BigDecimal (s2);

                return b2.compareTo(b1);
            }
        });
        for (int i=0; i<n; i++) {
            System.out.println(s[i]);
        }
        sc.close();
    }
}

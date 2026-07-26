import java.util.Scanner;
public class StringIntroduction {
    public static void main (String[] args){
        Example();
    }

    public static void Example(){
        Scanner sc = new Scanner (System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        if(A.compareTo(B)>0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");

            String A1 = Character.toUpperCase(A.charAt(0)) + A.substring(1);
            String B1 = Character.toUpperCase(B.charAt(0)) + B.substring(1);

            System.out.println(A1 + " " + B1 );

        }
    }
}

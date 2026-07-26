import java.util.Scanner;
public class EndOfFile {
    public static void main(String [] args) {

        endOfFileExample2 ();
    }

    public static void endOfFileExample1 (){
        Scanner sc = new Scanner (System.in);
        int sum = 1;
        while(sc.hasNext()){
            int a = sc.nextInt();
            sum= sum + a;
            System.out.println(sum);
        }
    }
    public static void endOfFileExample2 (){
        Scanner sc = new Scanner (System.in);
        int a = 1;

        while (sc.hasNext()){
            String b = sc.nextLine();
            System.out.println( a + b);
            a++;
        }
    }
}
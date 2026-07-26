import java.util.Scanner;

public class TypeConversionOrCasting {
    public static void main (String[] args){
        typeConversionExample2();
    }
    public static void stringToInt(){
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int x = Integer.parseInt(s);

        if (n==x){
            System.out.println("Satisfied");
        }
    }
    public static void typeConversionExample1(){
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        String s = String.valueOf(m);
        double n = Double.parseDouble(s);
        System.out.println(n);
        long l1 = sc .nextLong();
        String k = String.valueOf(l1);
        long l2 = Long.parseLong(k);

    if (m==n  && l1==l2){
        System.out.println("satisfied");
       }
    }
    public static void typeConversionExample2(){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       long b = a;
       System.out.println(b);
    }
}



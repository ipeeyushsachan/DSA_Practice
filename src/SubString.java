import java.util.Scanner;

public class SubString {
    public static void main (String[] args){
        example2();
    }
    public static void example1(){
        String s = "HelloWorld";
        System.out.println(s.substring(3,7));
    }
    public static void example2(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(s.substring(a,b));
    }
}

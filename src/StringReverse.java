import java.util.Scanner;
public class StringReverse {
    public static void main (String[] args){
        example2();
    }

    public static void example1(){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String reverse = "" ;

        for (int i = s.length()-1 ; i >=0 ; i-- ){
            reverse = reverse + s.charAt(i);
        }
        if (s.equals(reverse)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
    public static void example2 (){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();

        int left = 0;
        int right = s.length()-1;

        boolean palindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)){
                palindrome = false;
                break;
            }
            left++ ;
            right-- ;
        }
        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

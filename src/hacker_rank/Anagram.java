package hacker_rank;

import java.util.Scanner;
public class Anagram {
    public static void main (String[] args){
    example2();
    }

    public static void example1() {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        A = A.toLowerCase();
        B = B.toLowerCase();

        if (A.length() != B.length()) {
            System.out.println("false");
            return;
        }

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            int countA = 0 ;
            int countB = 0 ;

            for(int j = 0; j < A.length(); j++){
                if (A.charAt(j) == ch){
                    countA++ ;
                }
                if (B.charAt(j) == ch){
                    countB++ ;
                }
            }

                if (countA != countB){
                    System.out.println("false");
                    return;
            }
        }
        System.out.println("true");
    }

    public static void example2(){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        A = A.toLowerCase();
        B = B.toLowerCase();

        if (A.length() != B.length()) {
            System.out.println("False");
            return;
        }
        for ( int i = 0 ; i < A.length()-1; i++ ){
            char ch = A.charAt(i);

            int countA = 0;
            int countB = 0;

            for ( int j=0 ; j < A.length()-1 ; j++ ) {
                if (A.charAt(j) == ch){
                    countA++;
                }
                if (B.charAt(j) == ch){
                    countB++;
                }
            }
            if (countA != countB){
                System.out.println("False");
            }
        }
        System.out.println("True");
    }
}

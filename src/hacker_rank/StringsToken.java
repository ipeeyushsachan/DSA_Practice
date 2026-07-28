package hacker_rank;

import java.util.Scanner;

public class StringsToken {
    public static void main (String[] args){
        example2();
    }

    public static void Example1(){
        Scanner sc = new Scanner (System.in);

        String s = sc.nextLine();
        String word = "";
        int count = 0;

        for (int i = 0 ; i < s.length(); i++){

            char ch = s.charAt(i);

            if(Character.isLetter(ch)){
                word = word += ch ;

            }else {
                if(word.length() > 0){
                    count++;
                    System.out.println(word);
                    word = "";
                }
            }
        }
        if(word.length() > 0){
            count++;
            System.out.println(word);
        }
    }
    public static void example2(){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();

        if(s.trim().isEmpty()){
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);

        for(int i = 0 ;i < tokens.length ; i++){
            System.out.println(tokens[i]);
            sc.close();
        }
    }
}

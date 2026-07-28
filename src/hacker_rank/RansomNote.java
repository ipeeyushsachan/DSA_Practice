package hacker_rank;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    public static void main (String[] args){
    }
    public static void inputTake(){
        Scanner sc = new Scanner (System.in);
        int numberOfQueries = sc.nextInt();

        for(int i = 0; i < numberOfQueries; i++){
            String word1 = sc.nextLine();
            String word2 = sc.nextLine();
            twoWordChecker(word1,word2);
        }
    }

    public static boolean twoWordChecker(String input1, String input2 ){

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < input1.length(); i++){
            char ch = input1.charAt(i);
            if (map.containsKey(ch)){
               map.put (ch,map.get(ch) + 1);
            } else {
                map.put (ch,)
            }
        }
    }
}

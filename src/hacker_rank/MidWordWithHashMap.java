package hacker_rank;

import java.util.HashMap;
import java.util.Scanner;

public class MidWordWithHashMap {
    public static void main(String[] args) {
        takeInput();
    }

    public static void takeInput() {
        Scanner sc = new Scanner(System.in);
        int noOfQueries = sc.nextInt();

        for (int i = 0; i < noOfQueries; i++) {
            String word1 = sc.nextLine();
            String word2 = sc.nextLine();
            boolean result = checkWordsSame(word1, word2);
            print(result);
        }
    }

    public static boolean checkWordsSame(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }

        HashMap<Character, Integer> charOfInputs = new HashMap<>();

        for (int i = 0; i < input1.length(); i++) {
            char key = input1.charAt(i);

            if (charOfInputs.containsKey(key)) {
                charOfInputs.put(key, charOfInputs.get(key) + 1);
            } else {
                charOfInputs.put(key, 1);
            }
        }

        for (int i = 0; i < input2.length(); i++) {
            char key2 = input2.charAt(i);
            if (charOfInputs.containsKey(key2)) {
                charOfInputs.put(key2, charOfInputs.get(key2) - 1);
            } else {
                return false;
            }
        }

//        for (Character key : charOfInputs.keySet()) {
//            if (charOfInputs.get(key) != 0) {
//                return false;
//            }
//        }

        for (int value : charOfInputs.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void print(boolean result) {
        System.out.println(result);
    }
}

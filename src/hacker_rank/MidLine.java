package hacker_rank;

import java.util.Scanner;

public class MidLine {
    public static void main(String[] args) {

        String[] lines = takeInput();

        for(int i = 0; i < lines.length; i++){
            String middleWord  = logicMidWord(lines[i]);
            print(middleWord);
        }
    }

    public static String[] takeInput() {
        Scanner sc = new Scanner(System.in);

        int numberOfLines = sc.nextInt();
        sc.nextLine();
        String[] linesStorage = new String[numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {
            String line = sc.nextLine();
            linesStorage[i] = line;
        }

        return linesStorage;
    }

    public static String logicMidWord(String line) {
        String[] wordsArray = line.split(" ");
        int mid = wordsArray.length / 2;
        if (wordsArray.length % 2 == 0) {
            String midWord1 = wordsArray[mid];
            String midWord2 = wordsArray[mid - 1];
            return (midWord1 + " " + midWord2);
        } else {
            return wordsArray[mid];
        }
    }

    public static void print(String input) {
        System.out.println(input);
    }
}

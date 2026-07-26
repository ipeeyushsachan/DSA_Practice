import java.util.Scanner;

public class PrintString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        sc.nextLine();
        String[] lineValue = new String[numberOfLines];

        for(int i = 0; i < numberOfLines; i++){
            String line = sc.nextLine();
            lineValue[i] = line;
        }

        for(int i = 0; i < numberOfLines; i++){
            printValue(getWordsCount(lineValue[i]));
        }
        for(int i = 0; i < numberOfLines; i++){
            printValue(getLastWord(lineValue[i]));
        }
    }
    public static int getWordsCount(String input){
        return input.split(" ").length;
    }
    public static String getLastWord(String input){
        String[] wordsArray =  input.split(" ");
        return wordsArray[wordsArray.length - 1];
    }

    public static <T> void printValue(T value){
        System.out.println(value);
    }
}

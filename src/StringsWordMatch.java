import java.util.Scanner;

public class StringsWordMatch {
    public static void main(String[] args) {
        inputReader();
    }

    public static void inputReader() {
        Scanner sc = new Scanner(System.in);
        int number0fQueries = sc.nextInt();

        for (int i = 0; i < number0fQueries; i++) {
            print(wordMatcher(sc.next(), sc.next()));
        }
    }

    public static boolean wordMatcher(String input1, String input2) {
        if (input1.length() == input2.length()) {
            int length = input1.length();

            char[] input1Word = new char[length];
            char[] input2Word = new char[length];

            for (int i = 0; i < length; i++) {
                input1Word[i] = input1.charAt(i);
                input2Word[i] = input2.charAt(i);
            }

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (input1Word[i] == input2Word[j]) {
                        input1Word[i] = '\0';
                        input2Word[j] = '\0';
                        break;
                    }
                }
            }

            for (int k = 0; k < length; k++) {
                if (input1Word[k] != input2Word[k]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void print(boolean result) {
        System.out.println(result);
    }
}

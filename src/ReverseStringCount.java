import java.util.Scanner;

public class ReverseStringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stringCount = sc.nextInt();
        sc.nextLine();

        String[] storage = new String[stringCount];

        for (int i = 0; i < stringCount; i++) {
            storage[i] = sc.nextLine();
        }

        for (int i = 0; i < stringCount; i++) {
            print(reverseString(storage[i]));
        }

        for (int i = 0; i < stringCount; i++) {
            print(count(storage[i]));
        }
    }

    public static String reverseString(String input) {
        String[] wordString = input.split(" ");
        String reverseSentence = "";
        for (int i = wordString.length - 1; i >= 0; i--) {
            if (i == wordString.length - 1) {
                reverseSentence = reverseSentence + wordString[i];
            } else {
                reverseSentence = reverseSentence + " " + wordString[i];
            }
        }
        return reverseSentence;
    }


    public static int count(String input) {
        return input.split(" ").length;
    }

    public static <T> void print(T input) {
        System.out.println(input);
    }

}

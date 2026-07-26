import java.util.Scanner;

public class PrintSquareEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] numberStore = new int[count];

        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            numberStore[i] = number;
        }

        for (int i = 0; i < count; i++) {
            int a = squareOfNumber(numberStore[i]);
            print(a);
        }

        for (int i = 0; i < count; i++) {
           String answer = evenOdd(numberStore[i]);
           print(answer);
        }
    }

    public static int squareOfNumber(int value) {
        return value * value;
    }

    public static <T> void print(T input) {
        System.out.println(input);
    }

    public static String evenOdd (int input){
        String result = input + " is ";
        if (input % 2 == 0) {
             result = result + "even";
        } else {
            result = result + "odd";
        }
        return result;
    }
}


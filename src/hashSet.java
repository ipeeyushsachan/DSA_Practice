import java.util.HashSet;
import java.util.Scanner;

public class hashSet {
    public static void main (String[] args){
        example1();

    }
    public static void example1() {
        Scanner sc = new Scanner(System.in);

        int inputSize = sc.nextInt();
        sc.nextLine();

        HashSet<String> inputValue = new HashSet<>();

        for (int i = 0; i < inputSize; i++) {
            String input = sc.nextLine();
            inputValue.add(input);
            System.out.println(inputValue.size());
        }
    }
}


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args ) {
        example1();
    }
    public static void example1(){
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern s = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Scanner sc = new Scanner(System.in);

        int numSentence = Integer.parseInt(sc.nextLine());

        while (numSentence-- > 0){
            String input = sc.nextLine();
            Matcher m = s.matcher(input);

            while (m.find()){
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        sc.close();
    }
}

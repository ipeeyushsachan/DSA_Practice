package hacker_rank;

import java.util.Scanner;
import java.util.regex.*;

public class RegexSyntaxChecker {
    public static void main (String[] args){
        example1();
    }
    public static void example1(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int testcases = Integer.parseInt(s);
        while(testcases > 0) {
            String pattern = sc.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testcases--;
        }
    }
}

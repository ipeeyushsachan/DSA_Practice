public class Palindrome {
    public static void main(String[] args) {
        boolean result = stringPalindrome("madam");
        printX(result);

    }

    public static boolean stringPalindrome(String input) {
        boolean palindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }



    public static void printX(boolean result) {
        System.out.println("Result = " +  result);
    }
}

package hacker_rank;

import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression   = "^[A-Za-z][A-Za-z0-9]{7,29}$";
}

public class ValidUsername{
    private static final Scanner sc = new Scanner (System.in);

    public static void main(String[] args){

        int number = Integer.parseInt(sc.nextLine());

        while(number!= 0){
            String username = sc.nextLine();

            if(username.matches(UsernameValidator.regularExpression)){

                System.out.println("Valid");

            }else{
                System.out.println("Invalid");
            }
        }
    }
}

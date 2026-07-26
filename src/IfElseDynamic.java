import java.util.Scanner;

public class IfElseDynamic {
    public static void main (String[]args){
        takeInput();
    }
    public static void withdrawMoney (int Balance, int Withdraw){
        if (Withdraw > Balance) {
            System.out.println("Insufficient balance");
        }
        else if (Withdraw < 0) {
            System.out.println("Invalid amount");
        }
        else {
            Balance = Balance - Withdraw;
            System.out.println ( "Transaction Success" );
            System.out.println ( "Remaining Balance=" + Balance );
        }
    }

    public static void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Username");
        String userName = sc.nextLine();
        System.out.println("Enter The Password");
        String passWord = sc.nextLine();
        conditionIfElse(userName,passWord);
    }

    public static void conditionIfElse(String userName, String password) {
        if (userName.equals("Peeyush")) {
            if (password.equals("1234")) {
                printMessage("Login Successful");
            } else {
                printMessage("Wrong Password");
            }

        } else {
            printMessage("Wrong username");
        }

    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}

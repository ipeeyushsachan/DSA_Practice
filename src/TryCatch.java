import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        TryCatchDatatype();
    }

    public static void tryCatchAge() {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            System.out.println("Age =" + age);
        } catch (Exception e) {
            System.out.println("Please Enter A Valid Age");
        }
    }



    public static void TryCatchDatatype() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            try {
                long x = Long.parseLong(s);
                System.out.println(x + " can be fitted in:");

                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }
                System.out.println("* long");
                {
                }
            } catch (Exception e) {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
    }
}








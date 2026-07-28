package hacker_rank;

import java.util.Scanner;
public class StdinStdout {
    public static void main(String[] args) {
        inputOutputDemo();
    }

    public static void takeIntegerInput() {
        Scanner ps = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = ps.nextInt();
        System.out.println("Your Age Is " + age);
    }


    public static void takeNameInput() {
        Scanner kp = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = kp.nextLine();
        System.out.println("Hello" + name);
    }


    public static void calculationDemo() {
        Scanner kl = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = kl.nextInt();
        System.out.println("Enter The Second Number");
        int b = kl.nextInt();
        int sum = a + b;
        System.out.println("Sum=" + sum);

    }

    public static void inputOutputDemo() {
        Scanner pq = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = pq.nextLine();
        System.out.println("Enter Your Age ");
        int age = pq.nextInt();
        System.out.println("Enter Your Marks ");
        double marks = pq.nextDouble();
        System.out.println("Enter Your Status");
        boolean status = pq.nextBoolean();

        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(status);
    }

    public static void name() {
        Scanner kl = new Scanner(System.in);
        System.out.println("Enter your Home Name");
        String name = kl.nextLine();
        System.out.println("Home Name :" + name);
    }
}





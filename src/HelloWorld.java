public class HelloWorld {
    public static void main(String[] args) {
        printMessage();
        printlnMessage();
        printIn();
        printName();
        printA();
        printVote();
        printD();
    }


    public static void printlnMessage() {
        System.out.println("Hello, world.");
        System.out.println("Hello, java.");
    }


    public static void printMessage() {
        System.out.println("Hello, Kapil ");
        System.out.print("Hello, Peeyush ");
    }


    public static void printIn() {
        int i = 1;
        int j = 2;
        System.out.println(i + j);
    }


    public static void printName() {
        int a = 18;
        System.out.println("My age is " + a);
    }


    public static void printA() {
        char ch = 'A';
        System.out.println(ch + 1);
    }

    public static void printVote() {
        int age = 20;
        boolean canVote = age >= 18;
        System.out.println(canVote);
    }

    public static void printD() {
        int age = 18;
        double marks = 94.456;
        char grade = 'A';
        boolean passed = true;
        String name = "peeyush";

        System.out.printf(" Name : %s%n ", name);
        System.out.printf(" Age : %d%n ", age);
        System.out.printf(" Grade : %c%n ", grade);
        System.out.printf(" Marks : %.2f%n ", marks);
        System.out.printf(" Passed : %b%n ", passed);
    }
}
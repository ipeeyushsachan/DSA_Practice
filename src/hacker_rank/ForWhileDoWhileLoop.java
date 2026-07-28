package hacker_rank;

import java.util.Scanner;

public class ForWhileDoWhileLoop {
    public static void main(String[] args) {
        nestedForLoopSeries();

    }

    public static void forLoop1() {
        ;
        for (int i = 0; i <= 9; i++) {
            int j = i + 1;
            System.out.println(2 * j);
        }
    }

    public static void forLoop2() {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void forLoopScanner() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i += 5) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void forLoopName() {
        for (int i = 0; i <= 5; i++) {
            String a = "Java";
            System.out.println(a);

        }
    }

    public static void forLoopBoolean(){
        for (int i = 0; i <= 5; i++) {
            boolean Even= (i%2==0);
            System.out.println(Even);

        }
    }

    public static void forLoopIfElse(){
        for (int i = 0 ; i<=8 ; i++ ) {
            if( i % 2 == 0 ){
                System.out.println(i + " = Even");
            }
            else {
                System.out.println(i + " = Odd");
            }
        }
    }

    public static void forLoopSum(){
        int sum = 0 ;
        for (int i = 0 ; i<=8 ; i++ ) {
            if ( i % 2 == 0 ){
            sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void forLoopScannerIf() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number by which you know");
        int a = sc.nextInt();
        for ( int i=0; i<=a;i++ ){
            if ( i % 2 == 0){
              System.out.println(i +" = even");
            } else {
                System.out.println(i + " = odd ");
            }
        }
    }

    public static void forLoopScannerTable(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        for ( int i = 0; i<=10; i++ ){
            System.out.println(a  + "x" + i + "= " + (a*i));
        }
    }
    public static void forLoopFactorial(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Number");
        int a = sc.nextInt();
        long factorial = 1;
        for ( int i=1 ; i<=a; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void nestedForLoop(){
        for ( int i = 0; i<=10; i++ ){
            for ( int j = 0; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void nestedForLoopPattern(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for (int i=0; i<=m; i++){
            for (int k=0; k<=i;k++ ){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void nestedForLoopPattern1(int a){
        int number = 1;
        for (int i=0; i<=a; i++){
            for(int j=0; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    public static void nestedForLoopPatternTriangle(int a){
        for(int i = 0 ; i<a; i++ ){
            for(int j=0 ; j<=a-i-2; j++){
                System.out.print(" ");
            }
            for (int  j=0 ; j<2*i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void whileLoop (int i){
        while( i<=10 ){
            System.out.println(i);
            i = i+1;
        }
    }
    public static void whileLoopScanner(){
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Enter Number");
            int number = sc.nextInt();

            if(number == 0){

                break;

            }

            System.out.println(number);

        }
    }
    public static void doWhileLoop(){
        Scanner sc = new Scanner (System.in);
        int number;
        do {
            System.out.println("Enter Number");
            number = sc.nextInt();
            System.out.println(number);
        } while(number != 0);
    }
    public static void nestedForLoopSeries(){
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();
        for(int i=0 ; i<t; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = a;
            for(int j=0; j<c; j++) {
                sum = sum + (int) Math.pow(2, j) * b ;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
    public static void forLoopFormattingDataOuput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String word =sc.next();
            int integer =sc.nextInt();
            System.out.printf("%-15s%03d%n", word,integer);
        }
        System.out.println("================================");

    }

    public static void ForLoopTable (){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        for (int i=0;i<=9;i++){
            int k= i+1;
            System.out.println(n + " x " + k + " = " + n*k);
        }
    }
}





package hacker_rank;

import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerAddMultiply {
    public static void main (String[] args){
        example1();

    }
    public static void example1(){
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        sc.close();
    }
}

package hacker_rank;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main (String [] args){

        example3(1234.5);
    }

    public static void Example1(){
        NumberFormat us =
                NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(us.format(5000));
    }

    public static void example2(){
        double money = 5000 ;
        NumberFormat us =
                NumberFormat.getCurrencyInstance(Locale.US);
        String result = us.format(money);
        System.out.println(result);
    }

    public static void example3(double money){
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String result = us.format(money);
        String result2 = china.format(money);

        System.out.println(result);
        System.out.println(result2);

    }
}

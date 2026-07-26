import java.io.*;
import java.math.BigInteger;

public class PrimalityTest{
    public static void main (String[] args) {
        try {
            Example1();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public static void Example1()  throws IOException {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        BigInteger number = new BigInteger(s);

        if(number.isProbablePrime(1)){
            System.out.println("prime");

        }else{
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
}





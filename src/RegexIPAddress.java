import java.util.Scanner;

    public class RegexIPAddress {
    public static void main(String[] args){
        example1();
    }
    public static void example1(){
        Scanner sc = new Scanner(System.in);
        MyRegex obj = new MyRegex();

        while(sc.hasNext()) {
            String ip = sc.next();
            System.out.println((ip).matches(obj.pattern));
        }
    }
}

    class MyRegex{

        String pattern = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                    "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-9][0-4]|25[0-5])\\." +
                    "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-9][0-4]|25[0-5])\\." +
                   "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-9][0-4]|25[0-5])" ;

}

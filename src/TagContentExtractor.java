import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args ){
      example1();
    }
    public static void example1(){
        Scanner sc = new Scanner (System.in);
         int TestCases = Integer.parseInt(sc.nextLine());

         while(TestCases > 0){
             String Line = sc.nextLine();
             boolean found = false;
             Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");
             Matcher m = p.matcher(Line);

             while(m.find()){
                 System.out.println(m.group(2));
                 found = true;
             }
             if(!found){
                 System.out.println("None");
             }
             TestCases--;
         }
         sc.close();
    }
}

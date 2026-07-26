import java.util.Calendar;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {

        Example6();
    }

    public static void calenderExample1() {
        Calendar cal = Calendar.getInstance();
        int y = cal.get(Calendar.YEAR);
        System.out.println(y);
    }
    public static void calendarExample2() {
        Calendar cal = Calendar.getInstance();
        int z = cal.get(Calendar.MONTH);
        System.out.println(z);
    }
   public static void calendarExample3(){
        Calendar cal = Calendar.getInstance();
        int u = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(u);
   }
   public static void calendarExample4(int year, int month, int day){
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,day);
        int a = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(a);
   }

   public static void calendarExample5(int year, int month, int day){
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        int d = cal.get(Calendar.DAY_OF_WEEK);

        if (d==1)
            System.out.println ("Sunday");
        else if (d==2)
            System.out.println("Monday");
        else if (d==3)
            System.out.println("Tuesday");
        else if (d==4)
            System.out.println("Wednesday");
        else if (d==5)
            System.out.println("Thursday");
        else if(d==6)
            System.out.println("Friday");
        else
            System.out.println("Saturday");

    }

    public static void Example6(){
        Scanner sc = new Scanner (System.in);
        int month= sc.nextInt();
        int year = sc.nextInt();
        int day = sc.nextInt();
        calendarExample5(year,month,day);

    }
}

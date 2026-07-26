import java.util.Scanner;

public class DynamicParameter {
    public static void main (String[]arg){
//        printIn(1,2);
//        printIn(3,4);
//        printVote(70);
//        canVote(80);
//        canVoteGlobal(40,18);
//        canVoteGlobal(30, 19);
        canVoteGender("male",18, 18,20);
//          takeInput();


    }
    public static void printIn(int i, int j) {
        System.out.println(i + j);
    }
    public static void printVote(int age) {
        boolean canVote = age >= 18;
        System.out.println(canVote);
    }
    public static void canVote(int age) {
        if (age > 60) {
            print("Can Vote");
        } else {
            System.out.println("Can Not Vote");
        }
    }
    public static void print(String s){
        System.out.println(s);
    }

    public static void canVoteGlobal(int age, int minimumAge){
        if(age > minimumAge){
            System.out.println("can vote");
        } else {
            System.out.println("can not vote");
        }
    }
    public static void canVoteGender(String gender, int age, int minMaleAge, int minFemaleAge){
        if(gender.equals("male") && age >= minMaleAge ){
            System.out.println("Can Vote Male");
        }
        else if(gender.equals("male") && age < minMaleAge){
            System.out.println("Can Not Vote By Male");
        }
        else if(gender.equals("female") && age >= minFemaleAge ) {
            System.out.println("Can Vote Female");
        }
        else if  (gender.equals("female") && age < minFemaleAge) {
            System.out.println("Can Not Vote By female");
        }
        else {
            System.out.println("We support only male/female as a gender but you have passed gender=" + gender);
        }
    }
    public static void takeInput(){
        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();
        int a= sc.nextInt();
        printInput(g,a);
    }
    public static void printInput(String gender, int age){
        System.out.println("Gender = " + gender + ", Age = "+ age  );
    }

}

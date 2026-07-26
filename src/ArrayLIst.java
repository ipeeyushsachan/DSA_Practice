import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLIst {
    public static void main(String[] args){
        example1();
    }
    public static void example1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String p = sc.nextLine();

       List <List<Integer>> arrayList = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            String line = sc.nextLine();
            String[] lineNumber = line.split(" ");

            List<Integer> inputAsNumber = new ArrayList<>();

            for(int j=1; j < lineNumber.length; j++) {
                String number = lineNumber[j];
                int input = Integer.parseInt(number);

                inputAsNumber.add(input);

            }
            arrayList.add(inputAsNumber);
        }

        int b = sc.nextInt();
        for(int k = 0 ; k < b; k++){
                int m = sc.nextInt();
                int z = sc.nextInt();

                if ((m >= 1 && m <= arrayList.size() &&
                        z >= 1 && z <= arrayList.get(m-1).size())){
                    System.out.println(arrayList.get(m-1).get(z-1));

                } else{
                    System.out.println("ERROR!");
            }
        }
    }
}

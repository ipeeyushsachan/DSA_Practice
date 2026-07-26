import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDeleteQuery {
    public static void main (String[] args) {
        example1();

    }
    public static void example1(){
        Scanner sc = new Scanner (System.in);
        int numberOfInput = sc.nextInt();

        List<Integer> arrayList = new ArrayList<>();

        for( int i=0; i<numberOfInput; i++){
            int value = sc.nextInt();

            arrayList.add(value);
        }

        int numberOfQuery = sc.nextInt();

        for (int i = 0 ; i < numberOfQuery ; i++){

            String Query = sc.next();

            if (Query.equals("Insert")){
                int index = sc.nextInt();
                int valueOfIndex = sc.nextInt();
                arrayList.add(index, valueOfIndex);

            } else {
                int index = sc.nextInt();
                arrayList.remove(index);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}

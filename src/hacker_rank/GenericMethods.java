package hacker_rank;

public class GenericMethods {
    public static void main(String[] args){
        Integer[] number = {1,2,3};
        String[] value = {"Hello", "World"};

        Example1(number);
        Example1(value);



    }
    public static <T> void Example1(T[] array){
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}

import java.util.Scanner;

public class SubArray {
    public static void main (String[] args0){

        subArrayNegativeSumCount1();

    }
    public static void subArrayPrint(){
        Scanner sc = new Scanner(System.in);
        int[] value = new int[5];

        for(int i = 0; i<5 ; i++){
            value [i] = sc.nextInt();
        }
        for(int start = 0; start < 5; start++){
            for(int end = start; end < 5; end++ ){
                System.out.print("[");

                for (int k = start ; k <= end; k++){
                    System.out.print(value[k] + " ");

                    if(k != end ){
                        System.out.print(",");
                    }
                }
                System.out.println("]");
            }
        }
    }
    public static void subArrayNegativeSumCount() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        for(int i = 0; i < n ; i++){
            value[i] = sc.nextInt();
        }

        int count = 0;
        for(int start = 0; start < n; start++){
            int sum = 0;
            for(int end = start; end < n; end++ ){
                sum = sum + value[end];
                if (sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void subArrayNegativeSumCount1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        for(int i = 0; i < n ; i++){
            value[i] = sc.nextInt();
        }

        int result = Integer.MAX_VALUE;
        for(int start = 0; start < n; start++){
            int sum =  0;
            for(int end = start; end < n; end++ ){
                sum = sum + value[end];
                if (sum < result){
                    result = sum;
                }
            }
        }
        System.out.println(result);
    }
}

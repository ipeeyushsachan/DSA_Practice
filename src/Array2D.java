import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Array2D {
    public static void main(String[] args) throws IOException {
        int[][] kapil = new int[6][6];

        kapil[0][0] = 1;
        kapil[0][1] = 1;
        kapil[0][2] = 1;
        kapil[0][3] = 0;
        kapil[0][4] = 0;
        kapil[0][5] = 0;

        kapil[1][0] = 0;
        kapil[1][1] = 1;
        kapil[1][2] = 0;
        kapil[1][3] = 0;
        kapil[1][4] = 0;
        kapil[1][5] = 0;

        kapil[2][0] = 1;
        kapil[2][1] = 1;
        kapil[2][2] = 1;
        kapil[2][3] = 0;
        kapil[2][4] = 0;
        kapil[2][5] = 0;

        kapil[3][0] = 0;
        kapil[3][1] = 0;
        kapil[3][2] = 2;
        kapil[3][3] = 4;
        kapil[3][4] = 4;
        kapil[3][5] = 0;

        kapil[4][0] = 0;
        kapil[4][1] = 0;
        kapil[4][2] = 0;
        kapil[4][3] = 2;
        kapil[4][4] = 0;
        kapil[4][5] = 0;

        kapil[5][0] = 0;
        kapil[5][1] = 0;
        kapil[5][2] = 1;
        kapil[5][3] = 2;
        kapil[5][4] = 4;
        kapil[5][5] = 0;

        example1(kapil);
    }
    public static void example1(int[][] input) {
        int result = 0;
        for (int row=0; row<=3; row++){
            for (int col=0; col<=3; col++){
                int sumOfHourGlass = input[row][col] + input[row][col+1] + input[row][col+2] + input[row+1][col+1] + input[row+2][col] + input[row+2][col+1] + input[row+2][col+2] ;
                if(sumOfHourGlass > result){
                    result = sumOfHourGlass;
                }
            }
        }
        System.out.println(result);
    }
}


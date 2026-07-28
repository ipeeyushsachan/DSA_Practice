package hacker_rank;

import java.util.*;

public class Array1D {
    public static void  main (String[] args){
    Example1();
    }
    public static void Example1(){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}

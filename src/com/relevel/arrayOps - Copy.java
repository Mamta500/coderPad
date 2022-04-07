package com.relevel;

import java.util.Arrays;
import java.util.Scanner;

public class arrayOps {
    public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int m = sc.nextInt();

    int A[] = new int[n];
    int B[] = new int[m];

        for(int i=0; i<n; i++){
        A[i]= sc.nextInt();
    }
        for(int j=0; j<m; j++){
        B[j]= sc.nextInt();
    }
    boolean result= Arrays.equals(A,B);
        if(result== true){
        System.out.println(n);
    }
}
}

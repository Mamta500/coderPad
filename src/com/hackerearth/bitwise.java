package com.hackerearth;
import java.io.*;
import java.util.*;


public class bitwise {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++) {
        int N = Integer.parseInt(br.readLine().trim());
        int X = Integer.parseInt(br.readLine().trim());
        int Y = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        String[] arr_B = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i_A = 0; i_A < arr_A.length; i_A++) {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int[] B = new int[N];
        for (int i_B = 0; i_B < arr_B.length; i_B++) {
            B[i_B] = Integer.parseInt(arr_B[i_B]);
        }
        long out_ = solve(N, X, Y, A, B);
        System.out.println(out_);
    }
        wr.close();
        br.close();
    }
    static long solve(int N, int X, int Y, int[] A, int[] B){
        // Write your code here
        long result= 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
            int a= (A[i]^B[j])&X;
            int b= (A[i]^B[j])&Y;
            if(a==b) {
                result++;
                }
            }
        }
        //int[] result = {0};
        return result; }
}
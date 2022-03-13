package com.hackerearth;
import java.io.*;

public class hackEarthUpdateIt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            int M = Integer.parseInt(br.readLine().trim());
            String[] arr_B = br.readLine().split(" ");
            int[] B = new int[M];
            for(int i_B = 0; i_B < arr_B.length; i_B++) {
                B[i_B] = Integer.parseInt(arr_B[i_B]); }
            int[] out_ = updateIt(N, M, B);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++) {
                System.out.print(" " + out_[i_out_]); }
                System.out.println(); }
                wr.close();
                br.close(); }
    static int[] updateIt(int N, int M, int[] B){
        // Write your code here
         int[] result = new int[N];
        for(int l=0; l<N; l++){
            result[l] = 1;
        }
         for(int i=0; i< M; i++){
         int k= B[i];
         //int l = N-1;
         for(int j=k-1; j<N; j=j+k){
         //j= k-1;
         result[j]=(i+1)*result[j];
         //result[j]=(i+1)*1;

         }
         }
         //int[] result = {0};
        return result; }
        }
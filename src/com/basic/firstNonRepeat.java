package com.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class firstNonRepeat {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c= str.charAt(i);
            if(hmap.containsKey(c)== false){
                hmap.put(c,1);
            }
            else{
                int cf = hmap.get(c);
                cf++;
                hmap.put(c, cf);
            }
        }
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.println();
        }
    }
}

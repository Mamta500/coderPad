package com.mamta;

public class firstNonRep {

    public static int countChar(String s, char c){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(c== s.charAt(i)){
                count ++;
            }
        }
        return count;
    }

    public static char findFirst(String input){

        for(int j=0; j < input.length(); j++){
            int i = countChar(input,input.charAt(j) );
            if(i==1)
                return input.charAt(j);
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(findFirst("bappbale"));

    }
}

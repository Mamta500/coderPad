package com.mamta;

public class Palindrome {
    public static String getPalindrome(int n){
        int r, sum =0, temp;
        temp=n;
        while(n>0){
            r= n%10;
            sum=(sum*10) + r;
            n=n/10;
        }
        String a="Palindrome";
        String b= "Not a palindrome";
        if(temp==sum)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        //System.out.println(getPalindrome(1121));
        System.out.println(20%10);
    }
}

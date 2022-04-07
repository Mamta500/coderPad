package com.basic;

import java.util.Scanner;

public class runLengthEncode {
    public static String doEncode(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        System.out.println(doEncode(str));
    }
}
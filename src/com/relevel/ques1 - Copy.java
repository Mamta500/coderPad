//package com.relevel;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ques1 {
//    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////    Scanner sc= new Scanner(System.in);
////    int n= sc.nextInt();
////    int m = sc.nextInt();
////
////    int A[] = new int[n];
////    int B[] = new int[m];
////
////        for(int i=0; i<n; i++){
////        A[i]= sc.nextInt();
////    }
////        for(int j=0; j<m; j++){
////        B[j]= sc.nextInt();
////    }
////    boolean result= Arrays.equals(A,B);
////        if(result== true){
////        System.out.println(n);
////    }
//
//}
//
//    Array Operations
//
//    Problem Statement
//
//    Errichto has been given two arrays A and B. He considers the two arrays to be magical if they have the same length and Ai = Bi (for each valid i).
//
//        For any arbitrary array X, Errichto can do the following operation any number of times(zero or more)- choose a consecutive subarray of the array and replace it with a single integer element equal to the sum of all elements of the subarray. (For example - the array [ 2,4,6,8 ] can be converted to array [ 2,10,8 ] or array [ 2, 4,14 ] etc.).
//
//        Errichto wants to perform the above operations in such a way that both arrays A and B become magical making the length of the arrays as maximum as possible. Help him! If there is no way to make the arrays magical, print “-1”.
//
//        Constraints
//
//        ● 1 ≤ n, m ≤ 2.10^5
//
//        ● 1 ≤ ai, bi ≤ 10^9
//
//        Input Format
//
//        The first line of input contains two integer values n and m - the length of the first and second arrays respectively. The second line contains n space-separated integers a1, a2…an - the elements of the first array A. The third line contains m space-separated integers b1, b2…bn - the elements of the second array B.
//
//        Output Format
//
//        Print in a single line one integer value - the maximum length of the resulting magical arrays after performing some operations(zero or more). If there is no way to make the arrays magical, print “-1”.
//
//        Sample Input
//
//        5 4
//
//        10 2 3 4 5
//
//        10 7 2 5
//
//        Sample Output
//
//        3
//
//        Explanation of Sample
//
//        We can reduce both arrays A and B to [10, 9, 5] making it magical. This gives the maximum length possible to be 3.
//
//
//
//        Things to Note for the Candidate You can use your own IDE like Visual Studio Code, Eclipse, or any other IDE that you are comfortable with to build your solution code. The IDE provided on the platform is purely for submission. Avoid using the IDE for coding out the solution. Test against any custom input in your own IDE. In the IDE provided on the platform, you cannot pass custom test cases and see the output. Use standard input and standard output in your program for the IDE to run the test cases smoothly against your code. We are giving a sample problem statement along with a solution that will pass the test cases in the IDE. - Sample Problem Statement (Right Click and Open in New Tab to view.)
//
//
//Q1
//        Maximum Binary String
//
//        Problem Statement
//
//        Priyanka loves binary strings. One day while working with it, a thought came in her mind - what is the maximum length of non-decreasing subsequence she can make by removing some characters from the binary string. She tried but could not come up with a solution. Can you help her?
//
//        You will be given a binary string (formed from only ‘0’s and ‘1’s ) of length N. You have to output the maximum length of non-decreasing subsequence formed by removing some characters (zero or more).
//
//        Constraints
//
//        ● 1 ≤ T ≤ 10
//
//        ● 1 ≤ N ≤ 10^5
//
//        Input Format
//
//        The first line of the input contains T - the number of test cases. The first line of each test case contains an integer N - the length of the binary string. The second line of each test case is a binary string(containing only ‘0’s and ‘1’s).
//
//        Output Format
//
//        For each test case print in a single line only one integer value - the maximum length of non-decreasing subsequence which can be formed.
//
//        Sample Input
//
//        2
//
//        5
//
//        10011
//
//        5
//
//        10101
//
//        Sample Output
//
//        4
//
//        3
//
//        Explanation of Sample
//
//        In the first test case if we remove the ‘1’ from the 1st position, we get the length of maximum length of non-decreasing subsequence which is 4.
//
//
//
//        Things to Note for the Candidate You can use your own IDE like Visual Studio Code, Eclipse, or any other IDE that you are comfortable with to build your solution code. The IDE provided on the platform is purely for submission. Avoid using the IDE for coding out the solution. Test against any custom input in your own IDE. In the IDE provided on the platform, you cannot pass custom test cases and see the output. Use standard input and standard output in your program for the IDE to run the test cases smoothly against your code. We are giving a sample problem statement along with a solution that will pass the test cases in the IDE. - Sample Problem Statement (Right Click and Open in New Tab to view.)
//

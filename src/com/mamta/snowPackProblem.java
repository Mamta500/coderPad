package com.mamta;

public class snowPackProblem {
    public static int getSnow(int arr[]){
        int [] left = new int[arr.length];
        int [] right = new int[arr.length];
        left[0]=right[0];
        for(int i=1; i<arr.length; i++){
            left[i]= Math.max(arr[i],left[i-1]);
        }
        right[arr.length-1]= arr[arr.length-1];
        for(int i= arr.length-2; i>=0; i--){
            right[i]= Math.max(arr[i],right[i+1]);
        }
        int snow=0;
        for(int i =0; i<arr.length; i++){

            snow+= Math.min(left[i],right[i]) - arr[i];
        }
        return snow;

    }

    public static void main(String[] args) {
        System.out.println(getSnow(new int[]{0,1,3,0,1,2,0,4,2,0,3,0}));
    }
}

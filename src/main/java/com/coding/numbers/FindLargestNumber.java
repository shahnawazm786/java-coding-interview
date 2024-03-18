package com.coding.numbers;

public class FindLargestNumber {
    public static void main(String[] args) {
        getLargestNumber(new int[]{10,20,7,14,-8,60,5,9});
    }
    static void getLargestNumber(int[] num){
        int temp=num[0];
        for(int j=0;j<num.length;j++){
            for(int k=j+1;k<num.length;k++){
                if(num[k]>num[j]){
                    temp=num[k];
                    num[k]=num[j];
                    num[j]=temp;
                }
            }

        }
        for(int a : num){
            System.out.println(a);
        }
        System.out.println("First highest number is "+num[0]);
    }
}

package com.coding.numbers;

public class StrongNumberExample {
    public static void main(String[] args) {
        strongNumber(145);
    }
    static void  strongNumber(int num){
        int fact=num;
        int strong=0;
        int fac=1;
        while(fact>0){
            int j=fact%10; //145
            for(int l=1;l<=j;l++){
                fac=fac*l;
            }
            strong=strong+ fac;
            fact=fact/10;
            fac=1;
        }
        if(num==strong){
            System.out.println(num +" is strong number");
        }
        else
        {
            System.out.println(num +" is not strong number");
        }
    }
}

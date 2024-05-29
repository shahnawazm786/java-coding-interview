package com.coding.numbers;

public class SwapNumber {
    public static void main(String[] args) {
        swapWithoutThirdVariable(100,50);
    }
    static void swapWithoutThirdVariable(int x,int y){
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}

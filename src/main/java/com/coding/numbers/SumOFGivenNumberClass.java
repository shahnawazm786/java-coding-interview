package com.coding.numbers;

import java.util.Scanner;

public class SumOFGivenNumberClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        int result=0;
        for(int j=1;j<=number;j++){
            result=result+j;
            //System.out.println(result);
        }
        System.out.println("The sum of given number is "+result);
    }
}

package com.coding.numbers;

import java.util.Scanner;

public class FindOutFactorialClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int factoial=sc.nextInt();
        int result=1;
        for(int i=1;i<=factoial;i++){
            result=result*i;
        }
        System.out.println("Factorial of given number is =>"+result);
    }
}

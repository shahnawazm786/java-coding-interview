package com.coding.numbers;

import java.util.Scanner;

public class CheckEvenNumberClass {
    public static void main(String[] args) {
        System.out.println("Using turnery operator");
        System.out.println("Please enter any number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String exp=(number%2==0)? number+"\t is even" : number+"\t is not even";
        System.out.println(exp);
        System.out.println("Using if else operator");
        System.out.println("Please enter any number");

    }
}

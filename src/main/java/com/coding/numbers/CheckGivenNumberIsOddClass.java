package com.coding.numbers;

import java.util.Scanner;

public class CheckGivenNumberIsOddClass {
    public static void main(String[] args) {
        System.out.println("Using turnery operator");
        abc();
        System.out.println("Please enter any number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String exp=(number%2==1)? number+"\t is odd" : number+"\t is not odd";
        //String exp=(number%2==1)? number+"\t is odd" : number+"\t is not odd";
        System.out.println(exp);
        System.out.println("Using if else operator");
        System.out.println("Please enter any number");
        number=sc.nextInt();
        if(number%2!=0){
            System.out.println(number + "\t => is odd");
        }
        else {
            System.out.println(number + "\t => is not odd");
        }


    }
    static void abc(){
        System.out.println("Hello!!!!!!");
    }

}

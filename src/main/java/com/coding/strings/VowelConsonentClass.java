package com.coding.strings;

import java.util.Scanner;

public class VowelConsonentClass {
    public static void main(String[] args) {
        System.out.println("Using Turnery Operator ");
        System.out.println("Enter any alphabet");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        String expr=(c=='A' | c=='E' | c=='I'|c=='O'|c=='U'|c=='a' | c=='e' | c=='i'|c=='o'|c=='u')? "Vowel":"Consonent";
        System.out.println(c+"\tis\t=>"+expr);
        System.out.println("Using IF - ELSE ");
        System.out.println("Enter any alphabet");
        c=sc.next().charAt(0);
        if((c=='A' | c=='E' | c=='I'|c=='O'|c=='U'|c=='a' | c=='e' | c=='i'|c=='o'|c=='u')){
            System.out.println(c+"\tis vowel");
        }
        else {
            System.out.println(c+"\tis consonent");
        }

    }
}

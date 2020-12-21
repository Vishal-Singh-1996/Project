package com.company;
import java.util.Scanner;

public class take_input {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number one");
//        int a=sc.nextInt();
//        System.out.println("Enter number two");
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.println("The sum of two number is"+"="+sum);
//          boolean b1=sc.hasNext();
//          System.out.println(b1);
//        String str=sc.next();
        String str=sc.nextLine();

        System.out.println(str);
    }
}

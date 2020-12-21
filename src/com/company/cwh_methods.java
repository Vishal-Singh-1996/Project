package com.company;
import java.util.Scanner;

public class cwh_methods {
    public static void pattern_1(int n)
    {
        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++)
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int fibo(int n){
        if(n==1 || n==2){
            return (n-1);
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static int factorial(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
    public static int factorial_iterative(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        { int product=1;
            for(int i=1;i<=n;i++)
            {
                product=product*i;

            }
            return product;

        }
    }
    public static void main(String[] args) {
      /*  Scanner x=new Scanner(System.in);
        System.out.println("Enter The value");
        int a=x.nextInt();
        System.out.println("The value of factorial a is "+factorial(a));
        System.out.println("The value of factorial a is "+factorial_iterative(a));
        int c=fibo(5);
        System.out.println("The sum of fibonacci series is "+c);*/
//        pattern(6);
        pattern_1(6);

    }

}

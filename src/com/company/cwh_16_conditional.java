package com.company;
import java.util.Scanner;
public class cwh_16_conditional
{
    public static void main(String[] args)
    {
    /*    System.out.println("Conditional if-else");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int age=sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("youe are going to become an Adult");
                break;
            case 21:
                System.out.println("You are going to join a Job");
                break;
            case 60:
                System.out.println("you are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }

        if (a>6)
            System.out.println("a is greater than "+a);
        else
            System.out.println("a is lesser than "+a);*/
        String var="vishal";
        switch (var) {
            case "vishal":
                System.out.println("You are going to become an Adult");
                break;
            case "arvind":
                System.out.println("You are going to join a Job");
                break;
            case "shrikant":
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy Your Life");
                break;
        }
    }
}


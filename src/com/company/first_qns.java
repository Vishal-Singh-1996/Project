package com.company;
import java.util.Scanner;

public class first_qns {
    public static void main(String[] args) {
        System.out.println("Taking sub marks form user");
        Scanner m=new Scanner(System.in);
        System.out.println("Enter First subject marks");
        float a=m.nextFloat();
        System.out.println("Enter Second Subject Marks");
        float b=m.nextFloat();
        System.out.println("Enter third subject marks");
        float c=m.nextFloat();
        float sum=a+b+c;
        float per=(sum*100)/300;
        System.out.println("Percentage are"+per+"%");

    }
}

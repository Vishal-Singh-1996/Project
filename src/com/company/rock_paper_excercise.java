package com.company;
import java.util.Random;
import java.util.Scanner;
public class rock_paper_excercise {
    public static void main(String[] args) {
        System.out.println("Rock->Paper->Scissor");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 For Paper,2 For Scissor");
        int userInput=sc.nextInt();
        Random random=new Random();
        int computerInput=random.nextInt(3);
        if(userInput==computerInput)
        {
            System.out.println("Draw");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0
        || userInput==2 && computerInput==1)
        {
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Win!");
        }
        if(computerInput==0){
            System.out.println("Computer Choice:Rock");
        }
        if(computerInput==1){
            System.out.println("Computer Choice:Paper");
        }if(computerInput==2){
            System.out.println("Computer Choice:Scissor");
        }


    }
}

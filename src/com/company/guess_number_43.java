package com.company;
import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputNumber;
    public int noOfGussess=0;

    public int getNoOfGussess() {
        return noOfGussess;
    }

    public void setNoOfGussess(int noOfGussess) {
        this.noOfGussess = noOfGussess;
    }

    game(){
        Random rand=new Random();
       this.number=rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the numberr");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
//        return inputNumber;



    }
    boolean isCorrectNumber(){
        noOfGussess++;
        if(inputNumber==number){
            System.out.format("Yes you guesses it right,it was %d\n You Guessed it in %d attempts",number,noOfGussess);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low.....");
        }
        else if(inputNumber>number){
            System.out.println("Too high......");
        }
        return false;
    }


}

public class guess_number_43 {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b=g.isCorrectNumber();
//            System.out.println(b);

        }


    }




}

package com.FirstJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;

        int myNumber = (int)(Math.random()*100);

        do{
            System.out.println("Guss my Number : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WOOHOO . . CORRECT NUMBER!!!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }
        }while(userNumber >= 0);

        System.out.print("MY Number was : ");
        System.out.println(myNumber);

    }
}




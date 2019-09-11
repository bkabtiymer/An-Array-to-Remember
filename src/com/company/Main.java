package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){
        int presidents=10;
        String userInp="";

   String[] presiName= new String[presidents];
        Scanner input= new Scanner(System.in);

    System.out.println("Enter the last 10 presidents: ");
   for(int i=0;i<presiName.length;i++){
       System.out.println("Enter a president: ");
       presiName[i]=input.nextLine();
//
       System.out.println("Type history to quit or any other key to Continue");
       userInp=input.nextLine();
       if(userInp.equalsIgnoreCase("history")){
           System.out.println("Thanks bye");
           break;
       }
   }
    for(String president: presiName){
        System.out.println("Here are the presidents you entered:"+president);
    }


    }
}



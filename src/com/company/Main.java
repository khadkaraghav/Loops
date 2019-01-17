package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Program that prints 1 - 10

        /* for (int i=1; i<=10;i++)
        {System.out.println(i);}


         //Write a program that prints the numbers 1-10 backwards.

             for (int i=10; i>=1;i--)
            {System.out.println(i);}


            //Write a program that prints all the odd numbers from 1-20.

        for (int i=1; i<=20;i+=2)
            {System.out.println(i);}

        //Write a program that prints all the even numbers from 1-20.

        for (int i=2; i<=20;i+=2)
            {System.out.println(i);}


        //Have the user input a number and print all numbers from that input value to 1.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Integer.parseInt(input.nextLine());
        for (int i=n; i>=1;i--){
            System.out.println(i);}


        //Sum all values from 1-10.

        int total = 0; ;
        for (int i=1; i<=10; i++) {
            total = total + i;

        }
            System.out.println(total);



        // Have the user enter a number and print the sum of all numbers from that inputted value to 1.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Integer.parseInt(input.nextLine());

        for (int i=n-1; i>=1; i--){
            n+=i;
        }
        System.out.println(n);


 **********
 **********
 **********
 **********

        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<10; j++)
            {
                System.out.print("*");
            }

            System.out.println();



    *
    **
    ***
    ****
    *****


         for(int i=1; i<=5;i++)
        {
          for (int j=1;j<=i;j++)
          {
              System.out.print("*");
          }

          System.out.println();
        }



         *
        **
       ***
      ****
     *****


        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();



//Guessing Game


        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("I have chosen a number between 1 to 10.Try to guess it");
        System.out.println("Your guess:");
        n = Integer.parseInt(input.nextLine());



        while (n!=6){
            System.out.println("That is incorrect. Guess again");
            return;
        }

        System.out.println("That's right. Good guesser");

    }
}


    //Factorial of a Number:


    int n, fact=1;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        n = Integer.parseInt(input.nextLine());

        for (int i=1;i<=n;i++){
         fact = fact*i;
        }

        System.out.println(fact);
    }
}
*/













/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex32;
import java.util.*;

public class App {

    void output(String out)
    {
        System.out.println(out);
    }
    int input()
    {
        int var = 0;
        Scanner sc = new Scanner(System.in);
        int flag = -1;
        while(flag!=0)
        {
            if(sc.hasNextInt())
            {
                var = sc.nextInt();
                sc.nextLine();
                if(var == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    continue;
                }
                else
                {
                    flag = 0;
                }
            }
            else
            {sc.nextLine();
                System.out.println("Sorry. That's not a valid input.");}

        }
        return var;
    }
    boolean inputchar()
    {
        String var;
        Scanner sc = new Scanner(System.in);
        int flag = -1;
        while(flag!=0)
        {
            var = sc.nextLine();
            if(var.charAt(0) == 'y' || var.charAt(0) == 'n') {
                return false;
            }
            else
            {
                System.out.println("Sorry. That's not a valid input.");

            }
        }
        return false;
    }
    void initgame(){
        int flag = -1;
        int diff;
        int num;
        output("Let's play Guess the Number!");
        while(flag!=0)
        {
            output("Enter the difficulty level (1, 2, or 3):");
            diff = input();
            int min = 1;

            int max = 10*diff;
            int magic = (int)Math.floor(Math.random()*(max-min+1)+min);
            output("I have my number. What's your guess?");
            num = input();
            if(num == magic)
            {
                output("You got it in your first guess!");
            }
            else
            {
                int i=0;
                while(num !=magic)
                {
                    if(num > magic)
                    {
                        output("Too High. Guess again:");
                        num = input();
                        i++;
                    }
                    else if(num < magic)
                    {
                        output("Too low. Guess again:");
                        num = input();
                        i++;
                    }
                }
                output(String.format("You got it in %d guesses!", i+1));
                output("Do you wish to play again (Y/N)?");
                if(!inputchar())
                    flag = 0;
            }
        }
    }

    public static void main(String [] args)
    {
        App obj = new App();
        obj.initgame();
    }
}


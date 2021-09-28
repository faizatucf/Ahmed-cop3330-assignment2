/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex31;
import java.util.*;

public class App {

    static void karvonen(int age, int pulse)
    {

        System.out.println(String.format("Resting Pulse: %d\tAge: %d", pulse, age));
        String leftAlignFormat = "%-15s | %-4d%n";
        System.out.format("+---------------+---------+%n");
        System.out.format("+   Karvonen Heart Rate  +%n");
        System.out.format("+---------------+---------+%n");
        System.out.format("+---------------+---------+%n");
        System.out.format("| Intensity     | Rate    |%n");
        System.out.format("+--------------+---------+%n");
        for(int i = 55; i<=95; i+=5)
        {
            int TargetHeartRate =   (((220 - age) - pulse) * i/100) + pulse;
            System.out.println(String.format("%-15s | %-4s",i+"%", TargetHeartRate+" bpm"));
        }
    }
    static int input(String out)
    {
        int var = 0, flag=-1;
        while(flag!=0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println(out);
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
        if(flag == 0)
            return var;
        else
            return -1;
    }
    public static void main(String [] args)
    {
        int age, pulse;
        Scanner sc = new Scanner(System.in);
        pulse = input("Please enter your Resting Pulse");
        age = input("Please enter your Age");
        karvonen(age,pulse);
    }
}

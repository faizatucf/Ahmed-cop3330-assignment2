/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex26;
import java.util.*;

public class App {
    static void output(String out)
    {
        System.out.println(out);
    }
    static int calculateMonthsUntilPaidOff(double i, double b, double p)
    {
        i = i / 365;
        int result = (int) Math.ceil((-1/30.0)*Math.log(1+b/p*(1-Math.pow(1 + i, 30)))/Math.log(1 + i));
        return result;
    }

    public static void main(String [] args)
    {
        double i, b,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your balance?");
        b = sc.nextDouble();
        System.out.println("What is the APR on the card");
        i = sc.nextDouble();
        i = (i/100);
        System.out.println("What is the monthly payment you can make?");
        p = sc.nextDouble();
        output(String.format("It will take you %d months to pay off this card.\n",
                calculateMonthsUntilPaidOff(i,b,p)));
    }
}

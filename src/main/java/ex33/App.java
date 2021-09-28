/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex33;
import java.util.*;

public class App {

    static void output(String out)
    {
        System.out.println(out);
    }

    static int magic(String in)
    {
        int index = (int)Math.floor(Math.random()*(2+1));
        return index;
    }

    public static void main(String [] args)
    {
        App obj = new App();
        Scanner sc = new Scanner(System.in);
        output("What's your question?");
        String in = sc.nextLine();
        String arr[] = new String[]{"Yes", "No","Ask again later."};
        output(arr[magic(in)]);
    }
}


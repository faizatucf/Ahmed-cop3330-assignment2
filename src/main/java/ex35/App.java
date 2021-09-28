/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */
package ex35;

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;
public class App {

    void output(String out)
    {
        System.out.println(out);
    }

    String winner(String[] arr, int size)
    {
        int total = size-1;
        int index = (int)Math.floor(Math.random()*(total+1));
        return String.format("The winner is %s",arr[index]);
    }

    public static void main(String [] args)
    {
        App obj = new App();
        String[] users = new String[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true) {
            obj.output("Enter a name:");
            users[i] = sc.nextLine();
            if (users[i].equals("")) {
                break;
            }
            i++;
        };
        obj.output(obj.winner(users, i));
    }
}

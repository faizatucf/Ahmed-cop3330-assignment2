/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */
package ex34;

import java.util.Scanner;
import java.util.Arrays;
public class App {

    void output(String out)
    {
        System.out.println(out);
    }

    void remove(String[] arr)
    {
        output("There are 5 employees:");
        for(int i = 0; i<arr.length; i++)
        {
            output(arr[i]);
        }
        output("Enter an employee name to remove:");
        int flag = -1;
        Scanner sc = new Scanner(System.in);
        String re = sc.nextLine();
        for(int i = 0; i<arr.length; i++)
        {
            if(re.equals(arr[i]))
            {
                flag = 0;
            }
        }
        if(flag==0)
        {
            output("There are 4 employees:");
            for(int i = 0; i<arr.length; i++)
            {
                if(!re.equals(arr[i]))
                {
                    output(arr[i]);
                }
            }
        }
        else
        {
            output("No such entry exist.");
        }
    }

    public static void main(String [] args)
    {
        App obj = new App();
        String employee[] = new String[]{"John Smith", "Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};


        obj.remove(employee);
    }
}

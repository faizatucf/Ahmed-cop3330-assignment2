/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex28;
import java.util.*;

public class App {
    static void output(String out)
    {
        System.out.println(out);
    }

    static int addnumbers(int[] arr)
    {
        int sum = 0;
        for(int i =0; i<5;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i =0; i<5;i++)
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            numbers[i]+=num;
        }
        System.out.println("The total is " + addnumbers(numbers));
    }
}

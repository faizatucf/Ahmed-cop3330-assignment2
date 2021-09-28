/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */
package ex38;
import java.util.*;
public class App {
    void output(String out)
    {
        System.out.print(out);
    }

    void filterEvenNumbers(String[] arr)
    {
        output("The even numbers are: ");
        for(int i=0; i< arr.length; i++)
        {
            int tmp = Integer.parseInt(arr[i]);
            if(tmp % 2 == 0)
                output(String.format("%d ", tmp));
        }
        output("\n");
    }
    public static void main(String [] args) {
        App obj = new App();
        Scanner sc = new Scanner(System.in);
        String input;
        obj.output("Enter a list of numbers, separated by spaces\n");
        input = sc.nextLine();
        String[] arr = input.split(" ");
        obj.filterEvenNumbers(arr);
    }
}

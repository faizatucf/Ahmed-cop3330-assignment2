/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */
package ex36;
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
            output("Enter a number:");
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
            else if(sc.next().equals("done"))
            {
                 flag = 1;
                 break;
            }
            else
            {
                //sc.nextLine();
                System.out.println("Sorry. That's not a valid input.");}

        }
        if(flag == 1)
        {
            return -1;
        }
        return var;
    }

    String avg(int[] arr, int length)
    {
        double average, total=0;
        for(int i=0; i<length; i++){
            total += + arr[i];
        }
        average = total / length;
        return String.format("The average is: %.1f", average);
    }

    String min(int[] arr, int length)
    {
        int min = arr[0];
        for(int i=0; i<length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return String.format("The minimum is %d", min);
    }

    String max(int[] arr, int length)
    {
        int max = arr[0];
        for(int i=0; i<length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return String.format("The maximum is %d", max);
    }

    String sd(int[] arr, int length)
    {
        double sum = 0.0, standardDeviation = 0.0;
        for(int i=0; i<length; i++){
            sum += arr[i];
        }
        double mean = sum/length;
        for(int i=0; i<length; i++){
            standardDeviation += Math.pow(arr[i] - mean, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation/length);
        return String.format("The standard deviation is %.2f", standardDeviation);
    }

    public static void main(String [] args) {
        App obj = new App();
        int[] users = new int[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true) {
            int tmp = obj.input();
            if (tmp == -1) {
                break;
            }
            else
                users[i] = tmp;
            i++;
        };
        obj.output(obj.avg(users, i));
        obj.output(obj.min(users, i));
        obj.output(obj.max(users, i));
        obj.output(obj.sd(users, i));
    }
}

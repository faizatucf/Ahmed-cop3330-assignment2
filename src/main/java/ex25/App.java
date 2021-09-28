/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */
package ex25;
import java.util.*;
public class App {

    static int passwordValidator(String pass)
    {
        pass = pass.replaceAll("\\s", ""); //removing whitespace if any
        if(pass.matches("[0-9]+") && pass.length() <= 8)
        {
            return 0;
        }
        else if(pass.matches("[a-zA-Z0-9]*") && pass.length() <= 8)
        {
            return 1;
        }
        else if(pass.matches("[a-zA-Z0-9]*") && pass.length() > 8)
        {
            return 2;
        }
        else if(pass.matches("[a-zA-Z0-9\\W]*") && pass.length() > 8){
            return 3;
        }
        else
        {
            return 0;
        }
    }
    static void output(String out)
    {
        System.out.println(out);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] password = new String[]{"very weak password", "weak password",
                "strong password","very strong password"};
        System.out.println("Enter your password to determine its strength");
        String pass = sc.nextLine();
        output(String.format("The password '%s' is a %s", pass, password[passwordValidator(pass)]));
    }
}

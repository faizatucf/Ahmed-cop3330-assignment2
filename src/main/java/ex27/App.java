/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex27;
import java.util.*;

public class App {

    static void output(String out) {
        System.out.println(out);
    }

    static boolean validatefname(String fname)
    {
        return fname.replaceAll("[\\n\\t ]", "").length() > 2;
    }
    static boolean validatelname(String lname)
    {
        return lname.replaceAll("[\\n\\t ]", "").length() > 2;
    }
    static boolean validateid(String id)
    {
        return id.replaceAll("[\\n\\t ]", "").matches("[A-Z-]{3}[0-9]{4}");
    }
    static boolean validatezip(String zip)
    {
        return zip.replaceAll("[\\n\\t ]", "").matches("[0-9]{5}") && zip.length() == 5;
    }

    static void validateInput(String fname, String lname, String id, String zip)
    {
        int flag =-1;
        if(!validatefname(fname))
        {
            output("The first name must be at least 2 characters long.");
            flag = 1;
        }
        if(!validatelname(lname))
        {
            output("The last name must be at least 2 characters long.");
            flag = 1;
        }
        if(!validateid(id))
        {
            output("The employee ID must be in the format of AA-1234.");
            flag = 1;
        }
        if(!validatezip(zip))
        {
            output("The zipcode must be a 5 digit number");
            flag = 1;
        }
        if(flag == -1)
            output("There were no errors found.");

    }
    public static void main(String [] args)
    {
        String fname="",lname="", id="", zip="";
        Scanner sc = new Scanner(System.in);
        output("Enter the first name:");
        fname = sc.nextLine();
        output("Enter the last name:");
        lname = sc.nextLine();
        output("Enter the ZIP code:");
        zip = sc.nextLine();
        output("Enter the employee ID:");
        id = sc.nextLine();
        validateInput(fname,lname, id, zip);
    }
}

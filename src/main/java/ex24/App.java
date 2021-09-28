/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex24;
import java.util.*;

public class App {
    static boolean isAnagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return false;
        else
        {
            char[] st1 = str1.toCharArray();
            char[] st2 = str2.toCharArray();
            Arrays.sort(st1);
            Arrays.sort(st2);
            return Arrays.equals(st1, st2);
        }

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1="", str2="";
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string:");
        str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        str2 = sc.nextLine();
        if(isAnagram(str1,str2))
            System.out.println(String.format("%s and %s are anagrams.", str1, str2));
        else
            System.out.println(String.format("%s and %s are NOT anagrams.", str1, str2));
    }
}

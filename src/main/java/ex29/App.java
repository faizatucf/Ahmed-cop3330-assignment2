package ex29;


import java.util.Scanner;

public class App {


    static int input()
    {
        Scanner sc = new Scanner(System.in);
        int ror = 0, flag=-1;
        while(flag!=0)
        {
            System.out.println("What is the rate of return?");
            if(sc.hasNextInt())
            {
                ror = sc.nextInt();
                sc.nextLine();
                if(ror == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    continue;
                }
                else
                    flag = 0;
            }
            else
            {sc.nextLine();
                System.out.println("Sorry. That's not a valid input.");}

        }
        return ror;
    }
    static void output(String out)
    {
        System.out.println(out);
    }
    static int rule72(int ror)
    {
        int  years = 72 / ror;
        output(String.format("It will take %d years to double your initial investment.",years));
        return years;
    }
    public static void main(String [] args)
    {
        rule72(input());
    }
}

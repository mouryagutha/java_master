package TCS.Number_based;

import java.util.Scanner;

public class check_leap_year {
    public static void main(String[] args)
    {
        int year;
        boolean leap = false;

        System.out.println("enter the year");
       Scanner sc = new Scanner(System.in);
       year  = sc.nextInt();
       if((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0))
       {
           System.out.println(year+" "+" is a leap year");
       }
       else
       {
           System.out.println(year +" "+"is a not leap year");
       }

    }

}

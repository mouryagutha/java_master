package arrays;

import java.util.Scanner;

public class NumsPrint {
    public static void main(String[] args) {
        int n = 4; // The middle row number

       for(int i =1 ; i <=n ; i++)
       {
           int count = 2*(n-i) +1;
           for(int j = 0 ; j <count ; j++)
           {
               System.out.print(i);
           }
           System.out.println();
       }

       for(int i = n-1 ; i>= 1 ; i--)
       {
           int count = 2* (n-i) +1;
           for(int j = 0 ; j <count ; j++)
           {
               System.out.print(i);
           }
           System.out.println();
       }



    }


}




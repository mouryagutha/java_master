package TCS.Number_based;

import java.util.Scanner;

public class Armstrong_num {

    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int r, sum = 0;

        while(n>0)
        {
            r = n%10;
            n= n/10;
            sum = sum + r*r*r;
        }

        if(temp == sum)
        {
            System.out.println("it is armstrong");
        }
        else
        {
            System.out.println("it is not armstrong");
        }
    }
}

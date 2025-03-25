package TCS.Number_based;

import java.util.Scanner;

public class replace_0_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number , to replace the 0's with 5 ");
        int num = sc.nextInt();

        sc.close();

        if(num == 0)
        {
            num = 5;
            System.out.println(num);
        }

        int result =0 , place = 1;

        while(num>0)
        {
            int digit = num%10;
            if(digit == 0)
            {
                digit = 5;
            }

            result = result + digit * place;
            place *= 10;
            num /= 10;
        }


        System.out.println(result);

    }
}

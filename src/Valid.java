

import java.util.Scanner;

public class Valid{
    public static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Person is not eligible for vote");
        }
        else
        {
            System.out.println("person is eligible for vote");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
       validate(age);
       System.out.println("rest of code");
    }
}
package TCS.Number_based;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check if it is prime or not: ");
        int num = sc.nextInt();
        sc.close();  // Close Scanner to prevent resource leak

//        if (num <= 1) {
//            System.out.println("It is not a prime number.");
//            return;  // Exit early
//        }
//
//        boolean isPrime = true; // Assume it's prime initially
//
//        for (int i = 2; i * i <= num; i++) { // Check divisibility up to √num
//            if (num % i == 0) {
//                isPrime = false; // Found a divisor, not prime
//                break; // No need to check further
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(num + " is a prime number.");
//        } else {
//            System.out.println(num + " is not a prime number.");
//        }



        if(num == 1 || num == 0)
        {
            System.out.println("it is not prime");
        }

        boolean isprime = true;

        for(int i = 2 ; i <= num/2 ; i++ )
        {
            if(num % i == 0)
            {
                isprime = false;
            }


        }
        if(isprime)
        {
            System.out.println("it is prime number");
        }
        else
        {
            System.out.println("it is not prime number");
        }



    }
}

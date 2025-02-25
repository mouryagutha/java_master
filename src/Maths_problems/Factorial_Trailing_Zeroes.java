package Maths_problems;

import java.util.Scanner;

public class Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int results = Trailing_zeros(n);

        System.out.println(results);
    }

    public static int Trailing_zeros(int n)
    {

        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

}

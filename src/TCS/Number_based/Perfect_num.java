package TCS.Number_based;

import java.util.Scanner;

public class Perfect_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        boolean b = isPerfect(n);

        if (b) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }

    public static boolean isPerfect(int n) {
        if (n <= 1) return false; // Perfect numbers are greater than 1

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {  // Loop should run till n/2 (inclusive)
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n; // Return boolean result directly
    }
}

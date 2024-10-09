package arrays;

import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];  // Initialize the array with size 'n'

        // Input the array elements
        System.out.println("Enter the array numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the largest element
        int largest = arr[0];  // Initialize 'largest' with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  // Update 'largest' if a larger number is found
            }
        }

        // Output the largest number
        System.out.println("The largest number is: " + largest);

        sc.close();  // Close the scanner
    }
}

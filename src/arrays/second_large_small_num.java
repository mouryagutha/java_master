package arrays;

import java.util.Scanner;

public class second_large_small_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements to find second largest and second smallest.");
            return; // Exit if the array size is invalid
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the method to find second largest and second smallest
        int[] result = Secondlargeandsmallnum(arr);

        // Print the results
        System.out.println("Second largest element: " + result[0]);
        System.out.println("Second smallest element: " + result[1]);

        sc.close(); // Close the scanner
    }

    public static int[] Secondlargeandsmallnum(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Find largest and second largest
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Find smallest and second smallest
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return new int[]{secondLargest, secondSmallest}; // Return both results as an array
    }
}

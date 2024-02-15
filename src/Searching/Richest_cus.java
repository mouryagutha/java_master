package Searching;

public class Richest_cus {
    public static void main(String[] args) {
        // Example input
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        // Call the maximumWealth function with the input array
        int ans = maximumWealth(accounts);
        System.out.println("Richest customer's wealth: " + ans);
    }

    public static int maximumWealth(int[][] accounts) {
        // Initialize ans to the minimum value of integer
        int ans = Integer.MIN_VALUE;

        // Iterate through each row (person) in the accounts array
        for (int[] ints : accounts) {
            // Initialize sum for the current person to 0
            int sum = 0;
            // Iterate through each account (column) for the current person
            for (int anInt : ints) {
                // Add the wealth of each account to the sum
                sum += anInt;
            }
            // Check if the sum for the current person is greater than the current maximum wealth
            if (sum > ans) {
                // If yes, update the ans with the new maximum wealth
                ans = sum;
            }
        }
        // Return the maximum wealth found
        return ans;
    }
}

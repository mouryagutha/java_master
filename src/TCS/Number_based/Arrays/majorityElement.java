package TCS.Number_based.Arrays;// Java program to find Majority
// element in an array using sorting

import java.util.Arrays;

class majorityElement {

    // Function to find Majority element in an array
    // it returns -1 if there is no majority element
    static int majorityElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];

        int cnt = 1;
        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == arr[i]) {
                cnt++;
            } else {
                if (cnt > n / 2) {
                    return arr[i - 1];
                }
                cnt = 1;
            }
        }

        // Check the last element
        if (cnt > n / 2) {
            return arr[n - 1];
        }

        // if no majority element, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));
    }
}

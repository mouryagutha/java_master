package arrays;

public class SortedArray_and_rotatedArray {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Count the number of "out of order" pairs
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }

        // Check the boundary between the last and the first element
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        // Return true if the array is rotated sorted, i.e., count <= 1
        return count <= 1;
    }

    public static void main(String[] args) {
        SortedArray_and_rotatedArray solution = new SortedArray_and_rotatedArray();

        // Test cases
        int[] nums1 = {3, 4, 5, 1, 2};  // True (rotated sorted)
        int[] nums2 = {2, 1, 3, 4};     // False (not rotated sorted)
        int[] nums3 = {1, 2, 3};        // True (sorted, not rotated)
        int[] nums4 = {1, 1, 1};        // True (sorted with duplicates)

        System.out.println(solution.check(nums1));  // Output: true
        System.out.println(solution.check(nums2));  // Output: false
        System.out.println(solution.check(nums3));  // Output: true
        System.out.println(solution.check(nums4));  // Output: true
    }
}

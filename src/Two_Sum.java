import java.util.HashMap;
import java.util.Map;

class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        Two_sum solution = new Two_sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
    }
}

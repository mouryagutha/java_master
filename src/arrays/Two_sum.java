package arrays;

import java.util.HashMap;
import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 13, 11};
        System.out.println(Arrays.toString(twoSum(nums,9)));
        sample();
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (numToIndex.containsKey(target - nums[i]))
                return new int[] {numToIndex.get(target - nums[i]), i};
            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException();


    }
    public static int  sample()
    {

    }
}



package arrays;

import java.util.Arrays;

public class Move_zero {
    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,0,5};
        MoveZeros(arr);

    }

    public static void MoveZeros(int[] nums)
    {
        int count = 0;
        for(int i=0 ; i<nums.length;i++)
        {
            if(nums[i] !=0)
            {
                nums[count++]  = nums[i];
            }
        }
        while (count<nums.length)
        {
            nums[count++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

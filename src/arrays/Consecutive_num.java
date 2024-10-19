package arrays;

public class Consecutive_num {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};

        System.out.println(MaxConsones(nums));
    }

    public static int MaxConsones(int[] nums)
    {
        int curr_count = 0;
        int max_count = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                curr_count++;
                max_count = Math.max(max_count,curr_count);
            }
            else
            {
                curr_count=0;
            }
        }
        return max_count;
    }
}

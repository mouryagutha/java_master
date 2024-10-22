package arrays;

public class Remove_duplicate {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,3,3};
        System.out.println(removeduplicates(nums));

    }

    public static int removeduplicates(int[] nums)
    {
        int count=0;
        int n = nums.length;

        for(int i=0 ; i<n;i++)
        {
            if(i<n-1 && nums[i] == nums[i+1])
            {
                continue;
            }
            else
            {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

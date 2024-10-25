package arrays;

public class Single_number {
    public static void main(String[] args) {

        int[] nums= {2,2,1,1,3};
        System.out.println(Single_no(nums));
    }

    public static int Single_no(int[] nums)
    {
        int n = nums.length;
        int value = 0;
        for(int i=0; i<n; i++)
        {
            value = value^nums[i];
        }
        return value;
    }
}

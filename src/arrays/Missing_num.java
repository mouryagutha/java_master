package arrays;

public class Missing_num {
    public static void main(String[] args) {

        int nums[] = {0,1,2,4,5};
        System.out.println(missing_no(nums));

    }

    public static  int missing_no(int[] nums)
    {
        int n = nums.length;

        int sum =0 ;
        for(int i = 0; i<n ; i++)
        {
            sum = sum + nums[i];

        }
        int actualsum = (n*(n+1))/2;

        int missingnum = actualsum - sum;

        return missingnum;


    }
}

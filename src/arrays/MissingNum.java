package arrays;

import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {


        int nums[] = {0,1,2,4,5};
        System.out.println(missing_no(nums));

    }

    public static int missing_no(int[] nums)
    {
        int Xor1 = 0;
        int Xor2 = 0;

        int n = 6;

        for (int arr : nums)
        {
            Xor1 ^= arr;

        }

        for(int i=0 ; i<n ; i++)
        {
            Xor2 ^= i;
        }
        return Xor1^Xor2;

    }
}

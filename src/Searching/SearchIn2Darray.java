package Searching;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 5},
                {18,34,5},{24,56,2},{23,56,1,6,8}
        };
        int target = 34;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int target)
    {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length;row++){
            for(int col = 0 ; col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return  new int[]{row,col};
                }
            }
        }

        return  new int[]{-1,-1};
    }


}

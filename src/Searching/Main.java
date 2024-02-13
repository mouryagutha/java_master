package Searching;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23 ,45 ,1,2,5,-4 ,16,-11 , 28};
        int target = 2;
        int ans = linersearch(nums,target);
        System.out.println(ans);
    }
    //search in the array : return the index if item found
    ///otherwise if item not found return-1
    static int linersearch(int[] arr , int target)
    {
        if(arr.length == 0)
        {
            return -1;

        }
        for(int index = 0 ; index <arr.length;index++)
        {
            int element = arr[index];

            if(element == target)
            {
                return index;
            }
        }


        return -1;
    }

}

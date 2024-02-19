package Searching;

public class Orderagnostics {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,15,3,6-3,52,74,34};
        int target = 2;
        int ans = orderAgnostics(arr,target);
        System.out.println(ans);
    }

    static  int orderAgnostics(int[] arr ,int target)
    {
        int start =0;
        int end = arr.length-1;

        boolean isAsc  = arr[start]<arr[end];



        while(start<=end)
        {
//            int mid = (start + end)/2;
            int mid = start+(end-start)/2;

            if(arr[mid] == target)
            {
                return mid;

            }
            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid-1;

                } else  {
                    start = mid +1;

                }
            }
            else {
                if(target > arr[mid])
                {
                    end = mid-1;

                } else  {
                    start = mid +1;

                }
            }
        }
        return  -1 ;
    }

}

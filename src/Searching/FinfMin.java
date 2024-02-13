package Searching;

public class FinfMin {
    public static void main(String[] args) {
        int[] arr = {18 ,23,-46 , 45,1 ,4};
        System.out.println(min(arr));
    }
    static  int min(int[] arr)
    {
       int ans = arr[0];
       for(int i = 1 ; i< arr.length;i++)
       {
           if (arr[i]<ans)
               ans = arr[i];
       }
        return ans;

    }

}

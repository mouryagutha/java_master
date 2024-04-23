package arrays;

public class Duplicate_remove {
    public static  void main(String[] args)
    {
       int arr[] = {2,3,3,4,4,5,5,5,8,9,12,12,15};

       for(int i=0; i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
       int ans =   removeduplicate(arr);
       System.out.println();

        for(int i=0; i<ans;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    static  int removeduplicate(int[] arr)
    {
        int rd = 0;
        for(int i=1; i< arr.length; i++)
        {
            if(arr[rd] != arr[i] )
            {
                rd++;
                arr[rd] = arr[i];
            }

        }
        return rd+1;


    }
}

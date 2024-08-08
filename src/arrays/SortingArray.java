package arrays;

public class SortingArray {
    public static void main(String[] args)
    {
        int[] ar = {123,0,232,34,0, 23, 9 ,0, 0, 343,435,0,0};

        int count = 0;

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

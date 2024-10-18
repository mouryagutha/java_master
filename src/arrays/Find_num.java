package arrays;

public class Find_num {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8};
        int n = arr.length;
        int k = 6;

        int result = 0;
        for(int i =0; i<n; i++)
        {
            if (arr[i] == k) {
                result = 1;
               
            }

        }

        if(result == 1)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(-1);
        }

    }
}

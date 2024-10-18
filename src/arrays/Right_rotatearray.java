package arrays;

import java.util.Arrays;

public class Right_rotatearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        System.out.println(Arrays.toString(RotateRight(k, arr)));

    }

    public static int[] RotateRight(int k , int[] arr)
    {
        int n = arr.length;

        k %=n;

        Reverse(arr ,0, n-1);
        Reverse(arr,0, k-1);
        Reverse(arr,k, n-1);

        return arr;
    }

    public static void Reverse(int[] arr , int start , int end)
    {
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

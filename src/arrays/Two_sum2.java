package arrays;

import java.util.Scanner;

public class Two_sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of values");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values ");
        for(int i =0 ; i<n; i++)
        {

            arr[i]  = sc.nextInt();
        }
        System.out.println("enter the target value");
        int target = sc.nextInt();

        int[] results = twosum(arr, target);
        System.out.println("results: " + results[0] + ", " + results[1]);
    }

    public static int[] twosum(int[] numbers,int target)
    {
        int n = numbers.length;
        int[] results = new int[2];
        int number1 = 0;
        int sum = 0;

        for(int i =0 ; i<n ; i++)
        {
            number1 = numbers[i];

            for(int j=i+1 ;j<n ;j++)
            {
                sum = number1 +numbers[j];
                if(sum == target)
                {
                    results[0]=i;
                    results[1]=j;

                }
            }


        }

        return results;

    }
}

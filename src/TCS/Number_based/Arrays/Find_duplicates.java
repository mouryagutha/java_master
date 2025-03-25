package TCS.Number_based.Arrays;

import java.util.Scanner;

public class Find_duplicates {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the numbers");
        for(int i =0 ; i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i =0 ; i< n  ; i++)
        {
            for(int j = i+1 ; j< n ; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

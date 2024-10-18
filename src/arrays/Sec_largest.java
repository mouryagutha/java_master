package arrays;

import java.util.Scanner;

public class Sec_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }



        int large = Integer.MIN_VALUE;
        int sec_lar=Integer.MIN_VALUE;

        for(int i=1 ; i<n ; i++)
        {
            if(large < arr[i-1])
            {
                sec_lar = large;
                large = arr[i-1];
            } else if (arr[i]>sec_lar && large != arr[i]) {
                sec_lar = arr[i];
            }
        }

        if(sec_lar == Integer.MIN_VALUE)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(sec_lar);
        }


    }
}

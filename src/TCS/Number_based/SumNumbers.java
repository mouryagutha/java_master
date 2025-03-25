package TCS.Number_based;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value and end value");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
        for(int i =n; i<=m ; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}

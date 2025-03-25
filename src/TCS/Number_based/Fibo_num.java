package TCS.Number_based;

import java.util.Scanner;

public class Fibo_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  up to where the fibo want to print");
        int n = sc.nextInt();

        int a = 1 , b =1 , k = 0;

        System.out.print(a+" "+b+" ");
        while(k<n)
        {
            k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
        }




    sc.close();
    }
}

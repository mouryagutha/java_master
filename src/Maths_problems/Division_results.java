package Maths_problems;

import java.util.Scanner;

public class Division_results {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks");

        int total_marks = sc.nextInt();

        System.out.println("Enter the you got marks");

        int got_marks = sc.nextInt();

        int results = ((got_marks)*100)/total_marks;

        System.out.println(results +"%");



    }
}

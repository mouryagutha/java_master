package Collections_framworks;
import java.util.ArrayList;
import java.util.Scanner;

public class    ArrayListpro {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int numbers = 10;
        System.out.println("Enter the 10 numbers");
        for(int i= 0 ; i<numbers;i++)
        {
            int value = sc.nextInt();
            al.add(value);
        }

        System.out.println(al);
        al.set(4,3);
        System.out.println(al);
        int size = al.size();
        System.out.println("size of array"+size);
        Object al2 = al.clone();
        System.out.println("clone object"+al2);
        al2.equals(al);
        al.removeAll(al);
        System.out.println("Size of array is -->"+al);


    }

}

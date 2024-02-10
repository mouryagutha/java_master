package functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args)
    {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = in.next();
        String personalized = myGreet(name);
        System.out.println(personalized);

    }

   static String myGreet(String name) {
        String message = "hello "+ name;
        return  message;
    }

    static String greet()
    {
        return "how are you";
    }


}

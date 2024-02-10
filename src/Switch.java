import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit name");
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits ");
                break;
            case "apple":
                System.out.println("A sweet red fruits ");
                break;
            case "oapprange":
                System.out.println("round fruits ");
                break;
            case "grapes":
                System.out.println("small  fruits ");
                break;
            default:
                System.out.println("please enter a valid fruit");


                }
                System.out.println();
        System.out.print("let find out day is weekend or weekday with Swtich ");

        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("ERROR");
        }
    }
}

package oops;

public class Main {
    public static  void main(String[] args)
    {
        Box box1 = new Box(4.6,6.7,9.9);
        Box box2 = new Box(box1);
        System.out.println(box1.l+" "+box1.w+" "+box1.h);
    }

}

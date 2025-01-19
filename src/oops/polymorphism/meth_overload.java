package oops.polymorphism;

import java.util.Calendar;

class calculator{
    int add(int a , int b)
    {
        return a+b;
    }
    int add(int a ,int b , int c)
    {
        return a + b + c;
    }
}
public class meth_overload {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.add(10,20));
        System.out.println(calc.add(10,20,30));
    }
}

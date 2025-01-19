package oops.Abstraction;

interface Animal{
    void sound();
}
 class Cat implements Animal{
    @Override
     public void sound()
    {
        System.out.println("cat sounds");
    }
 }
public class Interface {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound();
    }
}

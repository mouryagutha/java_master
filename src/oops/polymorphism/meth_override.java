package oops.polymorphism;
class animal{
    void sound(){
        System.out.println("animals make sounds");

    }

}

class Dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class meth_override {
    public static void main(String[] args) {
        animal animals = new Dog();
        animals.sound();
    }
}

package oops;

public class inheritance {
    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Dog extends inheritance {
    void bark() {
        System.out.println("Woof!");
    }
}


class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Dog's own method
    }
}



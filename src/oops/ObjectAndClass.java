package oops;

class Car{
    String brand;
    int speed;

    void display(){
        System.out.print("Brand "+brand+" speed "+speed+"km/h");
    }
}
public class ObjectAndClass {

    public static void main(String[] args) {
        Car car1= new Car();
        car1.brand = "toyota";
        car1.speed = 150;
        car1.display();

    }
}

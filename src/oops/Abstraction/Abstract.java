package oops.Abstraction;

import java.awt.*;

abstract class Shape{

     abstract void draw();

     void display(){
         System.out.println("this is a shape");
     }
 }

 class Circle extends Shape {
     @Override
     void draw(){
         System.out.println("drawing a circle");
     }
 }
public class Abstract {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.display();
        shape.draw();
    }
}

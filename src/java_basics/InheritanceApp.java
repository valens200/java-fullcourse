package java_basics;

import java_basics.OOP.inheritance.Rectangle;
import java_basics.OOP.inheritance.Shape;
import java_basics.OOP.inheritance.Square;

public class InheritanceApp {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape myShape = new Square();
        Square myShape2 = new Square();
        myShape.sayName();
        myShape2.sayName();
        myShape2.setSide(89.8f);
        Shape rectangle = new Rectangle();
        ((Rectangle) rectangle).sayName(rectangle);
    }
}

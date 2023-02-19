package java_basics.inheritanceApp;

import java.util.ArrayList;

public class Application{


public static void main(String[] args) {


     ArrayList names = new ArrayList<>();
     names.add("hello");
     names.add("vava");
     System.out.println(names.get(0));
     Shape shape = new Shape();
     Square square = new Square();
     Circle circle = new Circle();
     Rectangle rectangle = new Rectangle();
     Triangle triangle = new Triangle();
     rectangle.sayName(triangle);
}

}
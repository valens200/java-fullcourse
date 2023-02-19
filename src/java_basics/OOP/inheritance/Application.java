
/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_basics.OOP.inheritance;
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
import inheritanceApp.Rectangle;
import inheritanceApp.Shape;
import inheritanceApp.Square;

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

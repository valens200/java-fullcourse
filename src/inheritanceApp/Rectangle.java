package inheritanceApp;

public class Rectangle extends Shape {
    private float height;
    private float width;

    public void setHeight(Float height){
        this.height = height;
    }

    public void setWidth(Float width){
        this.width = width;
    }
    public void sayName(Shape shape){
        if(shape instanceof Rectangle){
            ((Rectangle) shape).mySpecificName();
        }else{
            System.out.println("there is no rectangle");
        }
    }
    public void  mySpecificName(){
        System.out.println("I'm specfically rectangle");
    }
    
}

/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_basics.OOP.inheritance;

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

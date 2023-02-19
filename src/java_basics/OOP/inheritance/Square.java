/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_basics.OOP.inheritance;

public class Square extends Shape {

    private float side;
    public void setSide(float side) {
        this.side = side;
    }
    public float getSide() {
        return side;
    }
    public void sayName(){
        System.out.println("I'm a child class Square");
    }
    
}

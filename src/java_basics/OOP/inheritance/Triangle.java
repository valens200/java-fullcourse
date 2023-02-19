
/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_basics.OOP.inheritance;
public class Triangle  extends Shape{

    private float height;
    private float base;

    public void setHeight(float height) {
        this.height = height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    private float getHeight(){
        return height;
    }
    private float getBase(){
        return base;
    }

    public void sayName(){
        System.out.println("I'm child class Triable");
    }
    
}

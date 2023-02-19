package java_basics.inheritanceApp;

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

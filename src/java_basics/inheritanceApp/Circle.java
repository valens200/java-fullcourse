package java_basics.inheritanceApp;

public class Circle  extends Shape{
    private  int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void greeting(){
        System.out.println("I'm child clas circle");
    }
    
}

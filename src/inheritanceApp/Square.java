package inheritanceApp;

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

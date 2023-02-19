package java_basics.OOP.Abstruction.abstruct_interfaces;

public interface   Playable {
    public void play();

    //this default method is used when the implementing class tries to access a methods that have not implemented
    default void quit(){
        System.out.println("Please you are not allowed to quit");
    }
}

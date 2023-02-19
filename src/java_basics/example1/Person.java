package java_basics.example1;
//@author valens vava

public class Person {
    public String name;
    public  int age;
    public  float height;

    public  Person(){
        //default  constructor and will be used only when class is not public
    }
    //explicit
    public  Person(String name){
        this.name = name;
    }
    //explicit
    public  Person(String name , int age){

    }
    //explicit
    protected   Person(String name , int age, float height){
        this.age = age;
        this.height = height;
        this.name = name;
    }

}

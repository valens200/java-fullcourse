package java_basics.example1;

//@author valens vava

public class PersonProducer {

    public static void main(String[] args) {


        Person person1 = new Person("valens", 20, 90f);
        Person person2 = new Person("murangwa", 90, (float)90);
        Person person3 = new Person("bugingo", 34,45);
        System.out.println("My first person is : " +  person1.name + " he is " + person1.age + " years old" + " with " + person1.height + " cm");
        System.out.println("My second person is : " + person2.name + "  he is " + person2.age + " years old" + " with " + person2.height + " cm");
        System.out.println("My last person is : " + person3.name + " he is " + person3.age + " years old" + " with " + person3.height);

        System.out.println("==================================================");

        System.out.println("My first person is kept at :" + person1);
        System.out.println("My second person is kept at :" + person2);
        System.out.println("My last person is kept at : " + person3);
    }
}

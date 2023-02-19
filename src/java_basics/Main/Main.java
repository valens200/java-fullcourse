package java_basics.Main;

import java_basics.abstruct_interfaces.Playing;
import java_basics.generics.Book;
import java_basics.objectOperators.Person;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java", "valens");
        Book book1 = new Book("Java", "valens");
        System.out.println(book1.equals(book));
        Playing playing = new Playing();
//        playing.play();
//        playing.quit();

        Person person = new Person("vava", "45");
        Person person1 = new Person("vava", "45");
        System.out.println(person1.equals(book));
        

    }
}

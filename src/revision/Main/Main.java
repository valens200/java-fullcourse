package revision.Main;

import abstruct_interfaces.Playing;
import generics.Book;
import objectOperators.Person;

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

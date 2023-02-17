package generics;

public class Book {
     private  String title;
     private String author;

     public Book(String title, String author){
         this.author = author;
         this.title = title;
     }

     public  boolean equals(Object object){
         Book book = (Book) object;
         return book.title.equals(this.title) && book.author.equals(this.author);
     }

     public int hashCode(){
         return this.title.hashCode() + author.hashCode();
     }
}

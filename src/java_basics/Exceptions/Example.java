package java_basics.Exceptions;

public class Example {

    public static void main(String[] args) {
        String  s = "hello";
        getException(s);
    }

    public  static void  getException(String s){
        if(s.equals("hello")){
            System.out.println("String " + s +  " is equal to 'hello' ");
        }else{
            System.out.println("String " +  s + " is not equal to 'hello' ");
        }

    }
}

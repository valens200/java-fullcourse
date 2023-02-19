package java_basics.objectOperators;

public class Person {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else if(obj == null){
            return false;
        }if(this.getClass() != obj.getClass()){
            return false;
        }else {
            return this.getAge().equals(((Person) obj).getAge()) && this.getName().equals(((Person) obj).getName());
        }
    }
}

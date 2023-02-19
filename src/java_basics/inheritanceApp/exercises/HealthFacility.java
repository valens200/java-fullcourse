package java_basics.inheritanceApp.exercises;

public class HealthFacility  extends Location{


    public  void sayLocation(){
        System.out.println("I'm super class Location");
    }

    public  void sayName(Location location){
        if(location instanceof  HealthFacility){
            ((HealthFacility) location).saySelfName();
        }else{
            System.out.println("no location found");
        }
    }
    public  void saySelfName(){
        System.out.println("I'm child of location as 'HealthFacility'");
    }
}

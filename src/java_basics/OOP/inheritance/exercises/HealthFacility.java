/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_basics.OOP.inheritance.exercises;

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

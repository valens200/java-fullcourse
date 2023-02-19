/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_basics.OOP.inheritance.exercises;
public class ExerciseApp {
    public static void main(String[] args) {
        Location location = new Location();
        Location adminOffice = new AdminOffice();
        AdminOffice adminOffice1 = new AdminOffice();
        Location heathFacility = new HealthFacility();
        HealthFacility healthFacility = new HealthFacility();
        location.sayName();
        adminOffice.sayName();
        adminOffice1.sayName(location);

    }
}

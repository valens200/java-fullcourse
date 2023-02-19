/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_basics.OOP.inheritance.exercises;
public class AdminOffice extends  Location{

    public  void sayName(Location location){
        if(location instanceof AdminOffice){
            ((AdminOffice) location).saySelfName();
        }else{
            System.out.println("no location found");
        }
    }

    public void  saySelfName(){
        System.out.println("Im a child of Localtion as ' AdminOffice ' ");
    }
}

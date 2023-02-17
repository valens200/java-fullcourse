package inheritanceApp.exercises;

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

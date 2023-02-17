package inheritanceApp.exercises;

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

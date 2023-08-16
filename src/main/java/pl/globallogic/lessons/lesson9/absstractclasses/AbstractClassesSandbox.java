package pl.globallogic.lessons.lesson9.absstractclasses;

public class AbstractClassesSandbox {
    public static void main(String[] args) {
        Vehicle bike = new Bike(2,"LTB","mountain");
        Bike realBike = (Bike) bike;
        Vehicle car = new Car("Mazda","Diesel");
        driveTheVehicle(realBike);
        System.out.println("*****************");
        driveTheVehicle(car);



    }

    private static void driveTheVehicle(Vehicle vehicle){
        vehicle.drive();
    }
}

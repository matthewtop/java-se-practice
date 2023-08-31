package pl.globallogic.lessons.lesson9.absstractclasses;

public class Car extends Vehicle{

    private String fuel;
    public Car(String producer,String fuel){
        super(4,producer);
        this.fuel=fuel;
    }

    @Override
    public void drive(){
        ignite();
        pressClutch();
        selectGear(1);

    }

    private void selectGear(int gear) {
        System.out.println("Switched to "+gear+ " gear");
    }

    private void pressClutch() {
        System.out.println("Clutch have been pressed. ");
    }

    private void ignite() {
        System.out.println("Ignition....");
    }

    @Override
    public void switchLights(){
        super.switchLights();
        System.out.println("Switching light in car");
    }
}

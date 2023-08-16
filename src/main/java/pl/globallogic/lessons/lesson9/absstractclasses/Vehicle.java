package pl.globallogic.lessons.lesson9.absstractclasses;

public class Vehicle {
    protected int numberOfWheels;
    protected String producer;

    public Vehicle(int numberOfWheels, String producer){
        this.numberOfWheels=numberOfWheels;
        this.producer=producer;
    }

    public void drive() {
    }

    public void switchLights(){
        System.out.println("Switch lights in vehicle");
    }
}

package pl.globallogic.lessons.lesson9.absstractclasses;

public class Bike extends Vehicle{

    private final String type;

    public Bike(int numberOfWheels, String producer, String type){
        super(numberOfWheels,producer);
        this.type=type;
    }

    @Override
    public void drive(){
        pedal();
    }

    private void pedal(){
        System.out.println("We are pedalling");
    }
}

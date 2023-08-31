package pl.globallogic.lessons.lesson9.interfaces;

public interface Driveable {
    void start();
    void stop();
    void ignite();

    default void switchLights(){
        System.out.println("Switch");
    }
}

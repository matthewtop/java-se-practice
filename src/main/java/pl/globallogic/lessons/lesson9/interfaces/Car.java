package pl.globallogic.lessons.lesson9.interfaces;

public class Car implements Driveable{
    @Override
    public void start() {
        start();
    }

    @Override
    public void stop() {
        stop();
    }

    @Override
    public void ignite() {
        ignite();
    }
}

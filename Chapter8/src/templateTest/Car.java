package templateTest;

public abstract class Car {
    public String carName;
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void startCar();
    public abstract void stopCar();

    public void run() {
        turnOn();
        startCar();
        stopCar();
        turnOff();
    }
}

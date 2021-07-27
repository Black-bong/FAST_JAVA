package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void tunOff() {
        System.out.println("시동을 끕니다.");
    }

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    final public void run() {
        startCar();
        drive();
        stop();
        tunOff();
    }
}

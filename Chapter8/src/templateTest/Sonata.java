package templateTest;

public class Sonata extends Car {

    public Sonata() {
        carName = "Sonata";
    }

    @Override
    public void turnOn() { System.out.println(carName + " " + "시동을 켭니다."); }
    @Override
    public void turnOff() { System.out.println(carName + " " + "시동을 끕니다."); }
    @Override
    public void startCar() { System.out.println(carName + " " + "달립니다."); }
    @Override
    public void stopCar() { System.out.println(carName + " " + "멈춥니다."); }
}

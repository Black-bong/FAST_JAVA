package template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자동차가 스스로 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 스스로 멈춥니다.");
    }
}

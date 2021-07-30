package generic;

public class Plastic extends Material{
    @Override
    public void doPrint() {
        System.out.println("Plastic 으로 프린팅 합니다.");
    }

    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}

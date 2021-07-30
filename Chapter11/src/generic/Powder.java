package generic;

public class Powder extends Material{
    @Override
    public void doPrint() {
        System.out.println("Powder 로 프린팅 합니다.");
    }

    public String toString() {
        return "재료는 Powder 입니다.";
    }
}

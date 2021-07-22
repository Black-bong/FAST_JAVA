package cooperation;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "번의 지하철 승객 수는 " + passengerCount + "명이고 수익은 " + money + "원 입니다.");
    }
}

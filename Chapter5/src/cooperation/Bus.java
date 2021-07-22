package cooperation;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    // 승차
    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번의 버스 승객 수는 " + passengerCount + "명이고 수익은 " + money + "원 입니다.");
    }
}

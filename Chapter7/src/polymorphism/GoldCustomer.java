package polymorphism;

public class GoldCustomer extends Customer{
    double salesRatio;

    public GoldCustomer(String customerName, int customerID) {
        super(customerName, customerID);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    @Override
    public String calcPrice(int price) {
        bonusPoint += (price * bonusRatio);

        return customerName
                + "님이 "
                + (int)(price - (price * salesRatio))
                + "원 지불하셨습니다.\n"
                + customerName
                + "님의 현재 보너스 포인트는 "
                + bonusPoint
                + "점 입니다.";
    }
}

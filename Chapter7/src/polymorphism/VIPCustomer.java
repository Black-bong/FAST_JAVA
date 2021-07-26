package polymorphism;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

    public VIPCustomer(String customerName, int customerID, int agentID) {
        super(customerName, customerID);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;
    }

    @Override
    public String showCustomerInfo() {
        return customerName
                + "님의 등급은 "
                + customerGrade
                + "이며, 적립된 포인트는 "
                + bonusPoint
                + "점 입니다."
                + "담당 상담원 번호는 "
                + agentID
                + "입니다.";
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

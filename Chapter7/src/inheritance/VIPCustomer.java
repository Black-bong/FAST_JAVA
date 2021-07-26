package inheritance;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

//    public VIPCustomer() {
//        super();
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//
//        System.out.println("VIPCustomer 생성자 호출");
//    }

    public VIPCustomer(String customerName, int customerID) {
        // Class 상속 시 기본 생성자를 제공하지 않으면 명시적으로 내가 생성자를 호출해줘야한다.
        super(customerName, customerID);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        //System.out.println("VIPCustomer(String, int) 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += (price * bonusRatio);
        return price - (int)(price * salesRatio);
    }
}

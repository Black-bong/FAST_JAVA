package polymorphism;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerPark = new GoldCustomer("박종우", 10040);
        customerPark.bonusPoint = 1000;
        int pricePark = customerPark.calcPrice(20000);

        System.out.println(customerPark.showCustomerInfo() + customerPark.customerName + "님의 지불 금액은" + pricePark + "원 입니다.");
    }
}

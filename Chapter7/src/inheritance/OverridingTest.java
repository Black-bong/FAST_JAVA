package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer("이순신", 10010);
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer("김유신", 10020);
        customerKim.bonusPoint = 10000;

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + "지불 금액은" + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + "지불 금액은" + priceKim + "원 입니다.");

        // 메서드가 재정의 될 경우 타입(Customer)에 맞는 메서드 호출이 아닌 생성된 인스턴스(VIPCustomer)에 맞는 메서드가 호출된다.
        Customer customerNo = new VIPCustomer("나몰라", 10030);
        customerNo.bonusPoint = 10000;
        // 호출 가능으로 보여지는 메서드는 Customer 에서 생성된 메서드지만 실제 호출 시 VIPCustomer 에서 재정의 된 경우 재정의된 메서드가 호출된다.
        System.out.println(customerNo.showCustomerInfo() + "지불 금액은" + customerNo.calcPrice(10000) + "원 입니다.");
    }
}

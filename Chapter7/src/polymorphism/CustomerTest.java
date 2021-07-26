package polymorphism;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerKim = new Customer("Kim", 10010);
        Customer customerPark = new Customer("Park", 10020);
        Customer customerSin = new GoldCustomer("Sin", 10030);
        Customer customerLee = new GoldCustomer("Lee", 10040);
        Customer customerSong = new VIPCustomer("Song", 10050, 1234);

        customerList.add(customerKim);
        customerList.add(customerPark);
        customerList.add(customerSin);
        customerList.add(customerLee);
        customerList.add(customerSong);

        System.out.println("=====고객의 정보 출력=====");
        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("=====할인율과 보너스 포인트 계산");
        for(Customer customer : customerList) {
            System.out.println(customer.calcPrice(10000));
        }
    }
}

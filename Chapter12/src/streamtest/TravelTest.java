package streamtest;

import java.util.ArrayList;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer travelCustomerLee = new TravelCustomer(40, "이순신", 100);
        TravelCustomer travelCustomerKim = new TravelCustomer(20, "김유신", 100);
        TravelCustomer travelCustomerHong = new TravelCustomer(13, "홍길동", 50);

        ArrayList<TravelCustomer> travelCustomerList = new ArrayList<TravelCustomer>();

        travelCustomerList.add(travelCustomerLee);
        travelCustomerList.add(travelCustomerKim);
        travelCustomerList.add(travelCustomerHong);

        travelCustomerList.stream().map(TravelCustomer::getName).forEach(System.out::println);
        int total = travelCustomerList.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println(total);
        travelCustomerList.stream().filter(c -> c.getAge() >= 20).map(TravelCustomer::getName).sorted().forEach(System.out::println);
    }
}

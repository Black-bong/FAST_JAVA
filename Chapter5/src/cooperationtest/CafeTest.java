package cooperationtest;

public class CafeTest {
    public static void main(String[] args) {
        Person personLee = new Person("Lee", 10000);
        Person personKim = new Person("Kim", 20000);

        Cafe starCafe = new Cafe("StarCafe", 40000);
        Cafe beanCafe = new Cafe("BeanCafe", 50000);

        Menu starCafeAmericano = new Menu("Americano", 4000);
        Menu beanCafeLatte = new Menu("Latte", 4500);

        personKim.takeCafe(starCafe, starCafeAmericano.getBeverageCost());
        personLee.takeCafe(beanCafe, beanCafeLatte.getBeverageCost());

        starCafeAmericano.showMenuInfo();
        beanCafeLatte.showMenuInfo();

        starCafe.showCafeInfo();
        beanCafe.showCafeInfo();

        personKim.showPersonInfo();
        personLee.showPersonInfo();
    }
}

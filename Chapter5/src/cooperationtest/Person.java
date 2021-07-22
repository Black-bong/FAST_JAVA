package cooperationtest;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        setMoney(money);
        setName(name);
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }
    public String getName() { return name; }

    public void takeCafe(Cafe cafeName, int beverageCost) {
        setMoney(this.money -= beverageCost);
        cafeName.takeMoney(beverageCost);
    }

    public void showPersonInfo() { System.out.println(getName() + "의 잔액은 " + getMoney() + "원 입니다."); }
}

package cooperationtest;

public class Cafe {
    private String cafeName;
    private int money;
    private int sales;

    public Cafe(String cafeName, int money) {
        setMoney(money);
        setCafeName(cafeName);
    }

    public void setMoney(int money) { this.money = money; }
    public void setCafeName(String cafeName) { this.cafeName = cafeName; }

    public int getMoney() { return money; }
    public int getSales() { return sales; }
    public String getCafeName() { return cafeName; }

    public void takeMoney(int sales) {
        this.sales += sales;
        money += sales;
    }

    public void showCafeInfo() { System.out.println(getCafeName() + "의 매출액은" + getSales() + "원 이며, 보유금액은" + getMoney() + "원 입니다."); }
}

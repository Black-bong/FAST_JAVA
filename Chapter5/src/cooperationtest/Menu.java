package cooperationtest;

public class Menu {
    private String beverageName;
    private int beverageCost;

    public Menu(String beverageName, int beverageCost) {
        setBeverageCost(beverageCost);
        setBeverageName(beverageName);
    }

    public void setBeverageCost(int beverageCost) { this.beverageCost = beverageCost; }
    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public int getBeverageCost() { return beverageCost; }
    public String getBeverageName() { return beverageName; }

    public void showMenuInfo() { System.out.println(getBeverageName() + " " + getBeverageCost()); }
}

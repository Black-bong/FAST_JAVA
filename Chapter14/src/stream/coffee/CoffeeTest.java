package stream.coffee;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee kenyaMocha = new Mocha(new Latte(kenyaAmericano));
        kenyaMocha.brewing();
    }
}

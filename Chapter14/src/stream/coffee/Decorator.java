package stream.coffee;

public abstract class Decorator extends Coffee{

    Coffee coffer;
    public Decorator(Coffee coffee) {
        this.coffer = coffee;
    }

    @Override
    public void brewing() {
        coffer.brewing();
    }
}

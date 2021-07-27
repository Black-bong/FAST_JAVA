package gamelevel;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    public final void go(int playCount) {
        run();
        for(int i=0; i<playCount; i++) {
            jump();
        }
        turn();
    }
}

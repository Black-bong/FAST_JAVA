package gamelevel;

public class LevelDiamond extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("아주 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 Jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 다이아 *****");
    }
}

package gamelevel;

import java.awt.desktop.SystemSleepEvent;

public class LevelGold extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("못하지롱");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 골드 *****");
    }
}

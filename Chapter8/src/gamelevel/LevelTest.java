package gamelevel;

public class LevelTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        LevelGold levelGold = new LevelGold();
        player.levelUp(levelGold);
        player.play(2);

        LevelDiamond levelDiamond = new LevelDiamond();
        player.levelUp(levelDiamond);
        player.play(3);
    }
}

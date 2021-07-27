package gamelevel;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new LevelBronze();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void setLevel(PlayerLevel level) {
        this.level = level;
    }

    public void levelUp(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int playCount) {
        level.go(playCount);
    }
}
